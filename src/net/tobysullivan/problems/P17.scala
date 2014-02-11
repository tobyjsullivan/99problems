package net.tobysullivan.problems

object P17 {
  def split[T](n: Int, l: List[T]): Pair[List[T], List[T]] = (n, l) match {
    case (0, _) | (_, List()) => (List(), l)
    case (n, x :: xs) => {
      val (first, second) = split(n - 1, xs)
      (x :: first, second)
    }
  }
}