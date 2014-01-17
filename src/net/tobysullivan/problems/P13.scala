package net.tobysullivan.problems

object P13 {
  def encodeDirect[T](l: List[T]): List[Tuple2[Int, T]] = l match {
    case List() => List()
    case l => l.span(_ == l.head) match {
      case (a, b) => (a.size, a.head) :: encodeDirect(b)
    }
  }
}