public class P06 {
  def isPalindrome[T](l: List[T]): Boolean = l match {
    case List() => true
    case List(_) => true
    case x :: xs @ List(_ *) :: t :: Nil if x == t => isPalindrome(xs)
    case _ => false
  }
}
