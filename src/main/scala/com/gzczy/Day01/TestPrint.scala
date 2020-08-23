package com.gzczy.day01

object TestPrint {
  def main(args: Array[String]): Unit = {
    var name:String = "Tom"
    var sal:Double = 1.2
    println("Hello"+sal+name)
    // 使用格式化的方式Printf
    printf("name=%s sal=%f\n",name,sal)
    // 使用$方式引用输出变量 类似Php 括号可以进行表达式编写
    println(s"第三种方式 name=$name sal=${sal+1}")
  }
}
