package net.tobysullivan.problems

object P08 {
  def trimFront[T](l: List[T], f: T): List[T] = l match {
    case x :: xs if x == f => trimFront(xs, f)
    case xs => xs
  }
  
  def compress[T](l: List[T]): List[T] = l match {
    case List() => List()
    case x :: xs => x :: compress(trimFront(xs, x))
  }
  
  def altCompress[T](l: List[T]): List[T] = l match {
    case List() => List()
    case x :: xs => x :: altCompress(xs.dropWhile(r => x == r))
  }
  
  def altCompress2[T](l: List[T]): List[T] = l match {
    case List() => List()
    case x :: y :: xs if x == y => altCompress2(y :: xs)
    case x :: xs => x :: altCompress2(xs)
  }
}