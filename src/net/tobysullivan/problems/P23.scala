package net.tobysullivan.problems

import scala.util.Random

object P23 {
  def randomSelect[T](n: Int, l: List[T]): List[T] = (n, l) match {
    case (0, _) | (_, List()) => List()
    case (_, _) => {
      val (xs, e) = P20.removeAt(Random.nextInt(l.size), l)
      e :: randomSelect(n - 1, xs)
    }
  }
}