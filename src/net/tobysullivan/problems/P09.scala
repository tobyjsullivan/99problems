package net.tobysullivan.problems

object P09 {
  def pack[T](l: List[T]): List[List[T]] = l match {
    case List() => List()
    case x: List[T] => x.takeWhile(_ == x.head) :: pack(x.dropWhile(_ == x.head)); 
  } 
}