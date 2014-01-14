package net.tobysullivan.problems

object P06 {
  def isPalindrome[T](l: List[T]): Boolean = l match {
    case List() => true
    case List(_) => true
    case x :: xs if x == xs.last => isPalindrome(xs.take(xs.length - 1))
    case _ => false
  }
}
