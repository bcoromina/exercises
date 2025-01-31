package tree

trait TreeF[V] {
  type T <: TreeF[V] // using family polymorphism
  def left: Option[T]
  def right: Option[T]
  def value: V
}

sealed trait MyBinaryTreeF[V] extends TreeF[V] {
  override type T = MyBinaryTreeF[V]
}
case class NodeF[V](value: V, left: Option[MyBinaryTreeF[V]], right: Option[MyBinaryTreeF[V]]) extends MyBinaryTreeF[V]



sealed trait MyRedBlackTreeF[V] extends TreeF[V]{
  override type T = MyRedBlackTreeF[V]
}

// This doesn't compile because of mixing Tree types
//case class NodeRBF[V](value: V, left: Option[MyBinaryTreeF[V]], right: Option[MyRedBlackTreeF[V]]) extends MyRedBlackTreeF[V]



// F-Bounded polymorphism sets more strict constraint on types
//
sealed trait MyBinaryTreeFA[V] extends TreeF[V] {
  override type T = MyBinaryTreeF[V]
}

case class NodeFA[V](value: V, left: Option[MyBinaryTreeF[V]], right: Option[MyBinaryTreeF[V]]) extends MyBinaryTreeFA[V]


