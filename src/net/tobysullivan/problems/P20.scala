package net.tobysullivan.problems

object P20 {
  def removeAt[T](n: Int, l: List[T]): Pair[List[T], T] = (n, l) match {
    case (0, x :: xs) => (xs -> x)
    case (_, x :: xs) => {
      val (rest, target) = removeAt(n - 1, xs)
      ((x :: rest) -> target)
    }
    case (_, List()) => throw new NoSuchElementException()
  }

}