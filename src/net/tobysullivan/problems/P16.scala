package net.tobysullivan.problems

object P16 {
  def drop[T](n: Int, l: List[T]): List[T] = (n, l) match {
    case (0, _) | (_, List()) => l
    case (1, x :: xs) => xs
    case (_, x :: xs) => x :: drop(n - 1, xs)
  }
}