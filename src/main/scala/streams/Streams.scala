package streams

import scala.annotation.tailrec

trait HasNext[A] {
  def next(a: A): A
}

object HasNextInstances {
  implicit val integersHasNext: HasNext[Int] = new HasNext[Int]{
    override def next(a: Int): Int = a + 1
  }
}

sealed trait Stream[+A] {

  def take(n: Int) : List[A] = {
    @tailrec
    def aux(index: Int, acc: List[A], s: Stream[A]): List[A] = {
      if(index == 0){
        acc
      }else{
        s match {
          case Cons(head, tail) =>
            aux(index-1, head :: acc, tail())
          case Empty => acc
        }
      }
    }
    aux(n, List.empty, this).reverse
  }
  def from[B >: A](n: B)(implicit hasNext: HasNext[B]): Stream[B] = Cons(n, () => from(hasNext.next(n)))

  def fromList[B >: A](l: List[B]): Stream[B] = {
    @tailrec
    def aux(list: List[B], acc: Stream[B]): Stream[B] = {
      list match {
        case ::(head, next) =>
          aux(next, Cons( head, () => acc))
        case Nil => acc
      }
    }
    aux(l.reverse, Empty)
  }


  def map[B](f: A => B): Stream[B] = {
    def aux(s: Stream[A]): Stream[B] = {
      s match {
        case Empty => Empty
        case Cons(head, next) =>
          Cons(f(head), () => aux(next()) )
      }
    }
    aux(this)
  }


}

object Stream {
  def from[B](n: B)(implicit hasNext: HasNext[B]): Stream[B] = Empty.from(n)
  def fromList[B ](l: List[B]): Stream[B] = Empty.fromList(l)
}

case object Empty extends Stream[Nothing]
case class Cons[A](head: A, next: () => Stream[A]) extends Stream[A]


object Main  extends App {


  import HasNextInstances._

  val finiteStream = Stream.fromList(List(1,2,3,4,5))
  val infiniteStream = Stream.from(1)


  println(finiteStream.take(5))
  println(Stream.from(1).map(x => x * 2).take(10))

  def from(n: Int): LazyList[Int] = n #:: from(n+1)

  println(from(8).take(4).toList)
}
