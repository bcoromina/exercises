package tree


trait Tree[+T <: Tree[T,V], +V] { self: T =>
  def left: Option[T]
  def right: Option[T]
  def value: V
}

// This doesn't compile because of mixing Tree types
//sealed trait MyRedBlackTree[T,V] extends Tree[MyRedBlackTree[T,V], V]{
//  override def left: Option[MyRedBlackTree[T,V]]
//
//  override def right: Option[MyBinaryTree[T,V]]
//}

// It doesn't compile because  AnotherBinaryTree != MyBinaryTree ( self: T )
//sealed trait AnotherBinaryTree[+V] extends Tree[MyBinaryTree[V],V] {
//  override def left: Option[MyBinaryTree[V]]
//  override def right: Option[MyBinaryTree[V]]
//}

sealed trait MyBinaryTree[+V] extends Tree[MyBinaryTree[V],V] {
  override def left: Option[MyBinaryTree[V]]
  override def right: Option[MyBinaryTree[V]]

  def add[E >: V : Ordering](e:E): MyBinaryTree[E]= {
    val o = implicitly[Ordering[E]]
    def ins(t: MyBinaryTree[E], v: E): MyBinaryTree[E] = {

      def insOpt(opt: Option[MyBinaryTree[E]], v: E): MyBinaryTree[E] = opt match {
        case Some(t) => ins(t,v)
        case None => Node(v, None, None)
      }

      t match {
        case n@Node(nv, l, r) =>
          if(o.lt(v,nv)) {
            n.copy(left = Some(insOpt(l,v)))
          } else if(o.gt(v, nv)) {
            n.copy(right = Some(insOpt(r,v)))
          } else
            n
        case Leaf =>  Node(v, None, None)
      }
    }

    ins(this, e)
  }

  def sorted: List[V] = {
    def dfa(stack: List[MyBinaryTree[V]], acc: List[V]): List[V] = stack match {
      case Leaf :: tail => dfa(tail, acc)
      case Node(v, left, right) :: tail =>
        dfa(left.toList ++ tail , acc) ++ Seq(v) ++ dfa(right.toList ++ tail, acc)
      case Nil => acc
    }
    dfa(this :: Nil, List.empty)
  }

  def height: Int = {
    def maxDfa(stack: List[MyBinaryTree[V]], acc: Int): Int = stack match {
      case Leaf :: tail => maxDfa(tail, acc)
      case Node(_, left, right) :: tail =>
        val maxLeft = maxDfa(left.toList ++ tail , acc + 1)
        val maxRight = maxDfa(right.toList ++ tail, acc + 1)
        math.max(maxLeft,maxRight)
      case Nil => acc
    }
    maxDfa(this :: Nil, 0)
  }

  def isBalanced: Boolean = {
    def balanced(t: MyBinaryTree[V]): Boolean = t match {
      case Node(_, Some(l), Some(r)) =>
        balanced(l) && balanced(r)
      case Node(_, None, None) => true
      case Leaf => true
      case _ => false
    }
    balanced(this)
  }

  def map[E](f: V => E): MyBinaryTree[E] = {
    def dfa(stack: List[MyBinaryTree[V]], res: MyBinaryTree[E]):  MyBinaryTree[E] = stack match {
      case Leaf :: tail => dfa(tail,  res)
      case Node(v, left, right) :: tail =>
        Node(
          f(v),
          left.map(l => dfa(l :: tail, res)),
          right.map(r => dfa(r :: tail, res))
        )
      case Nil => res
    }
    dfa(this :: Nil, Leaf)
  }
}

case class Node[V](value: V, left: Option[MyBinaryTree[V]] = None, right: Option[MyBinaryTree[V]] = None) extends MyBinaryTree[V]

case object Leaf extends MyBinaryTree[Nothing] {
  override def left: Option[MyBinaryTree[Nothing]] = None

  override def right: Option[MyBinaryTree[Nothing]] = None

  override def value: Nothing = throw new Exception("Trying to access the value of a Leaf")
}



