package com.gzczy.Day03

object TestArithmetic {
  def main(args: Array[String]): Unit = {
    var r1:Int = 10/3
    println(r1)
    var r2:Double = 10/3
    println(r2)
    var r3:Double = 10.0/3
    println(r3)
    println(r3.formatted(".%2f"))
    var r4 = 10%3
    println(r4)
  }
}
