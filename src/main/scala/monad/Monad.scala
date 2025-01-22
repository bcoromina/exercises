package monad

import Opt._

trait Functor[F[_]] {
  def map[A,B](m: F[A])(f: A => B): F[B]
}


trait Monad[F[_]] extends Functor[F]{
  def pure[T](a: T): F[T]
  def flatMap[A,B](m: F[A])(f: A => F[B]): F[B]
  override def map[A,B](m: F[A])(f: A => B): F[B] = flatMap(m)(f andThen pure)
}

object MonadInstances {
  implicit val optMonad: Monad[Opt] = new Monad[Opt] {
    override def pure[T](a: T): Opt[T] = Value(a)

    override def flatMap[A, B](m: Opt[A])(f: A => Opt[B]): Opt[B] = m match {
      case Value(v) => f(v)
      case NoValue => NoValue
    }
  }
}

object MonadSyntax {
  implicit class MonadSyntax[F[_]: Monad, A](m: F[A]) {
    def flatMap[B](f: A => F[B]): F[B] = implicitly[Monad[F]].flatMap(m)(f)
    def map[B](f: A => B): F[B] = implicitly[Monad[F]].map(m)(f)
  }
}


