package net.tobysullivan.problems

object P12 {
  def explode[T](x: T, n: Int): List[T] = n match {
    case 0 => List()
    case n => x :: explode(x, n - 1)
  }

  def decode[T](l: List[Tuple2[Int, T]]): List[T] = l.map[List[T], List[List[T]]](
    _ match {
      case (n, x) => explode(x, n)
    }).flatMap { x => x }
}