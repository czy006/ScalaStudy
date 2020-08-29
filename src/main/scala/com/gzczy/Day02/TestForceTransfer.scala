package com.gzczy.Day02

object TestForceTransfer {
  def main(args: Array[String]): Unit = {

    //（1）当进行数据的从大——>小，就需要使用到强制转换
    var n1: Int = 2.5.toInt // 这个存在精度损失
    println(n1)

    //（2）强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    var r1: Int = 10 * 3.5.toInt + 6 * 1.5.toInt  // 10 *3 + 6*1 = 36
    var r2: Int = (10 * 3.5 + 6 * 1.5).toInt  // 44.0.toInt = 44

    println("r1=" + r1 + " r2=" + r2)

    //（3）Char类型可以保存Int的常量值，但不能保存Int的变量值，需要强转
    var c2: Char = 98 // 正确，因为直接将一个数值给char，编译器只判断是否越界
//    var c3: Char = 'a' + 1 // 错误，Int高->char低，编译器判断类型

    var c4: Char = ('a' + 1).toChar


    //（4）Byte和Short类型在进行运算时，当做Int类型处理。
    var a : Short = 5
    // a = a-2 // 错误， Int->Short

    var b : Byte = 3
    // b = b + 4 // 错误，Int->Byte
  }
}
