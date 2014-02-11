package net.tobysullivan.problems

object P25 {
  def randomPermute[T](l: List[T]): List[T] = P23.randomSelect(l.size, l)
}