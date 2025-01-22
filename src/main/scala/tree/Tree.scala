package tree



trait Tree[+T <: Tree[T,V], +V] {
  def left: Option[T]
  def right: Option[T]
  def value: V
}

sealed trait MyBinaryTree[+V] extends Tree[MyBinaryTree[V],V] {
  override def left: Option[MyBinaryTree[V]]
  override def right: Option[MyBinaryTree[V]]

  def add[E >: V](e:E)(implicit o: Ordering[E]): MyBinaryTree[E]= {
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

}

case class Node[V](value: V, left: Option[MyBinaryTree[V]] = None, right: Option[MyBinaryTree[V]] = None) extends MyBinaryTree[V]

case object Leaf extends MyBinaryTree[Nothing] {
  override def left: Option[MyBinaryTree[Nothing]] = None

  override def right: Option[MyBinaryTree[Nothing]] = None

  override def value: Nothing = throw new Exception("Trying to access the value of a Leaf")
}


// This doesn't compile because of mixing Tree types
//sealed trait MyRedBlackTree[T,V] extends Tree[MyRedBlackTree[T,V], V]{
//  override def left: Option[MyRedBlackTree[T,V]]
//
//  override def right: Option[MyBinaryTree[T,V]]
//}
