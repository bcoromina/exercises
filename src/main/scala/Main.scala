
import tree._




case class User2(id: Int, name: String, email: Option[String])


object OptionOperations {
  def toEither[R,L](o: Option[R], l: L): Either[L,R] =
    o match {
      case Some(value) => Right(value)
      case None => Left(l)
    }

  implicit class OptOps[R](o: Option[R]) {
    def toMyRight[L](l: L): Either[L,R] = toEither(o, l)
  }
}

object UserService2 {
  private val users = Map(
    1 -> User2(1, "Alice", Some("alice@example.com")),
    2 -> User2(2, "Bob", None),  // Missing email
    3 -> User2(3, "Charlie", Some("charlie@example.com"))
  )

  def findUserById(id: Int): Either[String, User2] = users.get(id).toRight("User not found")

  def getEmail(user: User2): Either[String, String] = user.email.toRight("Email not available")


  def printUserEmail(id: Int): Unit = {
    val res = for {
      user <- findUserById(id)
      eMail <- getEmail(user)
    } yield eMail

    res match {
      case Left(value) => println(value)
      case Right(email) => println(s"User email: $email")
    }
  }

}

case class User(id: Int, name: String, email: String)

object UserService {
  private val users = Map(
    1 -> User(1, "Alice", "alice@example.com"),
    2 -> User(2, "Bob", null),  // Missing email
    3 -> User(3, "Charlie", "charlie@example.com")
  )

  def findUserById(id: Int): User =
    if (users.contains(id)) users(id) else null

  def getEmail(user: User): String =
    if (user != null && user.email != null) user.email else null

  def printUserEmail(userId: Int): Unit = {
    val user = findUserById(userId)
    if (user != null) {
      val email = getEmail(user)
      if (email != null) {
        println(s"User email: $email")
      } else {
        println("Email not available")
      }
    } else {
      println("User not found")
    }
  }
}




object Main {

  def main(args: Array[String]) = {
    val tree = Node(5) add 2 add 4 add 3 add 5 add 1 add 19 add 45 add 2 add 16 add 0
    println(tree)
    println(tree.sorted)
    println(s"Height: ${(Node(5) add 2 add 6 add 7).height}")

    val in = (Node(9) add 8 add 7 add 6 add 5 )
    println(s"Tree: $in")
    println(s"Mapped: ${in.map(_ + 1).sorted}")
  }
}