package net.tobysullivan.problems

import P09._
import P10._

object problems {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c)
                                                  //| , List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res1: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,
                                                  //| 'e))
                               
}