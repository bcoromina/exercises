package tree


trait Tree[T <: Tree[T,V], V] { self: T =>
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

sealed trait MyBinaryTree[V] extends Tree[MyBinaryTree[V],V] {
  override def left: Option[MyBinaryTree[V]]
  override def right: Option[MyBinaryTree[V]]

  def add(e:V)(implicit o: Ordering[V]): MyBinaryTree[V]= {
    def ins(t: MyBinaryTree[V], v: V): MyBinaryTree[V] = {
      def insOpt(opt: Option[MyBinaryTree[V]], v: V): MyBinaryTree[V] = opt match {
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
      }
    }

    ins(this, e)
  }

  def sorted: List[V] = {
    def dfa(stack: List[MyBinaryTree[V]], acc: List[V]): List[V] = stack match {
      case Node(v, left, right) :: tail =>
        dfa(left.toList ++ tail , acc) ++ Seq(v) ++ dfa(right.toList ++ tail, acc)
      case Nil => acc
    }
    dfa(this :: Nil, List.empty)
  }

  def height: Int = {
    def maxDfa(stack: List[MyBinaryTree[V]], acc: Int): Int = stack match {
      case Node(_, left, right) :: tail =>
        val maxLeft = maxDfa(left.toList ++ tail , acc + 1)
        val maxRight = maxDfa(right.toList ++ tail, acc + 1)
        math.max(maxLeft,maxRight)
      case Nil => acc
    }
    maxDfa(this :: Nil, 0)
  }

  def map[E](f: V => E): MyBinaryTree[E] = {
    def dfa(stack: List[MyBinaryTree[V]]):  MyBinaryTree[E] = stack match {
      case Node(v, left, right) :: tail =>
        Node(
          f(v),
          left.map(l => dfa(l :: tail)),
          right.map(r => dfa(r :: tail))
        )
    }
    dfa(this :: Nil)
  }
}

case class Node[V](value: V, left: Option[MyBinaryTree[V]] = None, right: Option[MyBinaryTree[V]] = None) extends MyBinaryTree[V]




