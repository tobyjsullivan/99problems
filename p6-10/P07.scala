public object P07 {
  def flatten[T](l: List[T]): List[T] = {
    l.flatMap { x => x }
  }
}
