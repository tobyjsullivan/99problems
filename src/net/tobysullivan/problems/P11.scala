package net.tobysullivan.problems

import P09._

object P11 {
  def encodeModified[T](l: List[T]): List[Any] = pack(l).map {
    _ match {
      case List(x) => x
      case l: List[T] => (l.size, l.head)
    }
  }
}