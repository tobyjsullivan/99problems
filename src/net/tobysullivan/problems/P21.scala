package net.tobysullivan.problems

object P21 {
  def insertAt[T](e: T, n: Int, l: List[T]): List[T] = (n, l) match {
    case (0, _) | (_, List()) => e :: l
    case (_, x :: xs) => x :: insertAt(e, n - 1, xs)
  }
}