package edu.knoldus

import scala.annotation.tailrec

class StringLength{
  def length[L](list: List[L]):Int = {
    @tailrec
    def size(list: List[L],acc:Int):Int = list match {
      case Nil => acc
      case head :: tail => size(tail,acc+1)

    }
    size(list,0)
  }
}

object main extends App{
  val result = new StringLength
  println(result.length(List(9, 8, 5, 5, 4, 2, 7)))    //7
  println(result.length(List(1, 2, 5)))                //3
}