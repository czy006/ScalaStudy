package com.gzczy.Day02

object TestVar {
  def main(args: Array[String]): Unit = {

    //（1）声明变量时，类型可以省略（编译器自动推导，即类型推导）
    var age = 18
    age = 30

    //（2）类型确定后，就不能修改，说明Scala是强数据类型语言。
    //        age = "tom" // 错误

    //（3）变量声明时，需要初始值
    //        var name //错误

    var num1 = 10   // 可变
    val num2 = 20   // 不可变

    num1 = 30  // 正确
//    num2 = 100  //错误，因为num2是val修饰的

    // p1是var修饰的，p1的属性可以变，而且p1本身也可以变
    var p1 = new Person()
    p1.name = "dalian"
    p1 = null

    // p2是val修饰的，则p2的属性可以变，但是p2本身不可变（即p2的内存地址不能变）
    val p2 = new Person()
    p2.name="xiaolian"
    //        p2 = null // 错误的，因为p2是val修饰的

  }
}
