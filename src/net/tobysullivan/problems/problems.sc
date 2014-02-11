package net.tobysullivan.problems

object problems {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c)
                                                  //| , List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res1: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,
                                                  //| 'e))

  P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res2: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
 
  P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
                                                  //> res3: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e
                                                  //| , 'e)
  P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
                                                  //> res4: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,
                                                  //| 'e))
  P14.duplicate(List('a, 'b, 'c, 'c, 'd))         //> res5: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd))     //> res6: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd
                                                  //| , 'd, 'd)
  P20.removeAt(1, List('a, 'b, 'c, 'd))           //> res7: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  P21.insertAt('new, 1, List('a, 'b, 'c, 'd))     //> res8: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  P22.range(4, 9)                                 //> res9: List[Int] = List(4, 5, 6, 7, 8, 9)
  P22.range2(4, 9)                                //> res10: List[Int] = List(4, 5, 6, 7, 8, 9)
  P23.randomSelect(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h))
                                                  //> res11: List[Symbol] = List('g, 'd, 'a)
  P23.randomSelect(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h))
                                                  //> res12: List[Symbol] = List('h, 'd, 'e)
  P23.randomSelect(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h))
                                                  //> res13: List[Symbol] = List('b, 'f, 'c)
  P24.lotto(6, 49)                                //> res14: List[Int] = List(3, 9, 45, 46, 10, 27)
  P24.lotto(6, 49)                                //> res15: List[Int] = List(11, 16, 1, 45, 49, 22)
  P24.lotto(6, 49)                                //> res16: List[Int] = List(12, 15, 39, 24, 46, 20)
  P24.lotto(6, 49)                                //> res17: List[Int] = List(27, 21, 26, 39, 4, 3)
  
  P25.randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)) //> res18: List[Symbol] = List('e, 'a, 'c, 'b, 'd, 'f)
  P25.randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)) //> res19: List[Symbol] = List('b, 'e, 'c, 'd, 'f, 'a)
  P25.randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)) //> res20: List[Symbol] = List('c, 'b, 'd, 'f, 'a, 'e)
  P25.randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)) //> res21: List[Symbol] = List('d, 'b, 'e, 'a, 'f, 'c)
  
}