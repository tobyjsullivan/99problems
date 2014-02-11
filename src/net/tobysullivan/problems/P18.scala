package net.tobysullivan.problems

object P18 {

  def slice[T](i: Int, k: Int, l: List[T]): List[T] = l.drop(i).take(k - i)

  /* For Uji: */
  def drop[T](i: Int, l: List[T]): List[T] = (i, l) match {
    case (0, _) | (_, List()) => l
    case (_, x :: xs) => drop(i - 1, xs)
  }

  def take[T](i: Int, l: List[T]): List[T] = (i, l) match {
    case (0, _) | (_, List()) => List()
    case (_, x :: xs) => x :: take(i - 1, xs)
  }

}