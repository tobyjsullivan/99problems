package net.tobysullivan.problems

object P12 {  
  def decode[T](l: List[Tuple2[Int, T]]): List[T] = l match {
    case List() => List()
    case List((0, _)) => List()
    case (n, x) :: xs => (x :: decode(List((n - 1, x)))) ::: decode(xs)
  }
}