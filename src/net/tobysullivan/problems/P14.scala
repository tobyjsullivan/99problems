package net.tobysullivan.problems

object P14 {
  def merge[T](l: List[Tuple2[T, T]]): List[T] = l match {
    case (x, y) :: xs => x :: y :: merge(xs)
    case List() => List()
  } 
  
  def zip[T](a: List[T], b: List[T]): List[Tuple2[T, T]] = (a, b) match {
    case (x :: xs, y :: ys) => (x, y) :: zip(xs, ys)
    case _ => List()
  }
  
  def duplicate[T](l: List[T]): List[T] = merge(zip(l, l))
}