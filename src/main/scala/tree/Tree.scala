package tree



sealed trait Tree[+T] {

  def add[S >: T](e: S)(implicit o: Ordering[S]): Tree[S] = {
    def ins(t: Tree[S]): Tree[S] = t match {
      case Node(value, left, right) =>
        if(o.lt(e,value))
          Node(value, ins(left), right)
        else if(o.gt(e,value))
          Node(value, left, ins(right))
        else
          t
      case Leaf => Node(e)
    }
    ins(this)
  }

  def sorted: Seq[T] = {
    def dfa(l: List[Tree[T]], acc: List[T]): List[T] = l match {
      case Leaf :: _ => dfa(l.tail, acc)
      case Node(v, Leaf, Leaf) :: tail => dfa(tail, v :: acc)
      case Node(v, le, ri) :: tail => dfa(le :: tail , acc) ++ Seq(v) ++ dfa(ri :: tail, acc)
      case Nil => acc
    }
    dfa(this :: Nil, Nil)
  }

  override def toString(): String = {
    def levelSep(level: Int): String = (1 to (4*level)).map(_ =>" ").mkString
    def str[S >: T](t: Tree[S], level: Int): String = t match {
      case Node(value, Leaf, Leaf) =>
        s"${levelSep(level)}[Level $level]: $value"
      case Node(value, nl: Tree[S], nr: Tree[S]) =>
        s"""${levelSep(level)}[Level $level]: $value
           |${levelSep(level)}Left:
           |${str(nl, level + 1)}
           |${levelSep(level)}Right:
           |${str(nr, level + 1)}
           |""".stripMargin
      case Leaf => s"${levelSep(level)}[Leaf]"
    }

    str(this, 1)
  }
}

case object Leaf extends Tree[Nothing]
case class Node[T](value: T, l: Tree[T] = Leaf, r: Tree[T] = Leaf ) extends Tree[T]