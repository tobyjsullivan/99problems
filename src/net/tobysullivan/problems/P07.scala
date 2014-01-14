package net.tobysullivan.problems

object P07 {
  def flatten(l: List[Any]): List[Any] = {
    l.flatMap { x => x match { 
      case l: List[_] => flatten(l)
      case s => List(s)
      } }
  }
}
