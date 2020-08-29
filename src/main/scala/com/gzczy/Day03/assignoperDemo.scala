package com.gzczy.Day03

object assignoperDemo {
  def main(args: Array[String]): Unit = {

    //位运算
    var num = 2
    num <<= 2
    println(num)
    num >>= 3
    println(num)
    // 在scala中支持代码块返回
    val res = {
      if (num>1) "hello,ok" else 100
    }

    println(res)


  }
}
