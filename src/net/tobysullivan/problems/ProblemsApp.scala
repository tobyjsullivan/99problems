package net.tobysullivan.problems

object ProblemsApp extends Application {
  @annotation.tailrec
  def last[T](s: List[T]): T = s match {
    case List() => throw new NoSuchElementException
    case List(x) => x
    case x :: xs => last(xs)
  }

  @annotation.tailrec
  def penultimate[T](s: List[T]): T = s match {
    case List() => throw new NoSuchElementException
    case x :: _ :: Nil => x
    case x :: xs => penultimate(xs)
  }

  def nth[T](i: Int, s: List[T]): T = {
    if (i == 0) s.head
    else nth(i - 1, s.tail)
  }

  def length[T](s: List[T]): Int = s match {
    case List() => 0
    case x :: xs => length(xs) + 1
  }

  def reverse[T](s: List[T]): List[T] = s match {
    case List() => List()
    case x :: xs => reverse(xs) :+ x
  }
  
  println(last(List(1, 1, 2, 3, 5, 8)))
  
  println(penultimate(List(1, 1, 2, 3, 5, 8)))
  
  println(nth(2, List(1, 1, 2, 3, 5, 8)))
  
  println(length(List(1, 1, 2, 3, 5, 8)))
  
  println(reverse(List(1, 1, 2, 3, 5, 8)))
}