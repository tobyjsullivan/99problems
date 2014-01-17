package net.tobysullivan.problems

import P09._
import P10._
import P11._
import P12._
import P13._
import P14._
import P15._

object problems {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c)
                                                  //| , List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res1: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,
                                                  //| 'e))

  encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res2: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
 
  decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
                                                  //> res3: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e
                                                  //| , 'e)
  encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res4: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,
                                                  //| 'e))
  duplicate(List('a, 'b, 'c, 'c, 'd))             //> res5: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  duplicateN(3, List('a, 'b, 'c, 'c, 'd))         //> res6: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd
                                                  //| , 'd, 'd)
}