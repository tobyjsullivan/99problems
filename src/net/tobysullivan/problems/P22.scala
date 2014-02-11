package net.tobysullivan.problems

object P22 {
  def range(a: Int, b: Int): List[Int] = (a to b).toList
  
  def range2(a: Int, b: Int): List[Int] = if(a == b) List(a) else a :: range2(a + 1, b)
}