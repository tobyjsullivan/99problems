package net.tobysullivan.problems

import scala.util.Random

object P24 {
  def lotto(p: Int, r: Int): List[Int] = P23.randomSelect(p, (1 to r).toList)
}