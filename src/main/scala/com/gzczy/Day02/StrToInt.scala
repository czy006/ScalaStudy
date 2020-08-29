package com.gzczy.Day02

object StrToInt {
  def main(args: Array[String]): Unit = {
    val s1 = "12.5" //在Scala中，并不是将小数点截取后返回，而是会直接抛出异常
    println(s1.toInt) //error
    println(s1.toDouble) //ok
  }
}
