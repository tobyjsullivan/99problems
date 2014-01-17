package net.tobysullivan.problems

object P15 {
  def duplicateN[T](n: Int, l: List[T]): List[T] = (n, l) match {
    case (_, List()) => List()
    case (0, _) => List()
    case (n, x :: xs) => (x :: duplicateN(n - 1, List(x))) ::: duplicateN(n, xs) 
  }
}