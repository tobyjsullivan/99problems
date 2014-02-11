package net.tobysullivan.problems

object P19 {

  def rotate[T](n: Int, l: List[T]): List[T] = (n, l) match {
    case (0, _) | (_, List()) => l
    case (n, x :: xs) if (n > 0) => rotate(n - 1, xs :+ x)
    case (n, l) => rotate(n + 1, l.last :: l.init)
  }
}