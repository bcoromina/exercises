package Opt

import monad.Monad


sealed trait Opt[+T]
case class Value[T](v: T) extends Opt[T]
case object NoValue extends Opt[Nothing]

object Opt {
  implicit class OptOps[A](o: Opt[A])(implicit m: Monad[Opt]) {
    def flatMap[B](f: A => Opt[B]): Opt[B] = m.flatMap(o)(f)
    def map[B](f: A => B): Opt[B] = m.map(o)(f)
  }
}