
import tree._



object Main {

  def main(args: Array[String]) = {
    
    val tree = Leaf add 2 add 4 add 3 add 5 add 1 add 19 add 45 add 2 add 16 add 0
    println(tree)
    println(tree.sorted)
  }
}
