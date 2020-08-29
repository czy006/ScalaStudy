package com.gzczy.Day03

object TestLogic {
  def main(args: Array[String]): Unit = {

    // 测试：&&、||、!
    var a = true
    var b = false

    println("a&&b=" + (a && b))     // a&&b=false
    println("a||b=" + (a || b))     // a||b=true
    println("!(a&&b)=" + (!(a && b))) // !(a&&b)=true

    var r1 = 10

    r1 += 1 // 没有++
    r1 -= 2 // 没有--

    println(r1)

    // 测试：1000 << 1 =>10000
    var n1 :Int =8

    n1 = n1 << 1
    println(n1)
  }
}
