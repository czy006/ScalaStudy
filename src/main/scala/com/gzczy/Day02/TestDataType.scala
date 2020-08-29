package com.gzczy.Day02

object TestDataType {
  def main(args: Array[String]): Unit = {

    // 正确
    var n1:Byte = 127
    var n2:Byte = -128

    // 错误
    // var n3:Byte = 128
    // var n4:Byte = -129

    var n5 = 10
    println(n5)

    var n6 = 9223372036854775807L
    println(n6)

    // 建议，在开发中需要高精度小数时，请选择Double
    var n7 = 2.2345678912f
    var n8 = 2.2345678912

    println("n7=" + n7)
    println("n8=" + n8)

    //（1）字符常量是用单引号 ' ' 括起来的单个字符。
    var c1: Char = 'a'

    println("c1=" + c1)

    //（2）可以直接给Char赋一个整数，然后输出时，会按照对应的unicode字符输出
    println("c1码值=" + c1.toInt)

    var c2: Char = 98 // 正确，因为直接将一个数值给char，编译器只判断是否越界
//    var c3: Char = 'a' + 1 // 错误，Int高->char低，编译器判断类型

    var c4: Char = ('a' + 1).toChar

    println(c4)

  }
}
