package net.tobysullivan.problems

import P09._

object P10 {
  def encode[T](l: List[T]): List[Tuple2[Int, T]] = pack(l).map(l2 => (l2.size, l2.head))
}