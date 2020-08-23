package com.gzczy.day01

object HelloPrint {
  def main(args: Array[String]): Unit = {
    /**
     *  \t:一个制表符 实现对齐功能
     *  \n:换行符
     *  \\：一个\
     *  \"：一个"
     *  \r：一个回车
     * */

    println("姓名\t年龄")
    println("姓名\t20")
    println("Hello 张三\n123")
    println("Hello\ra")
  }
}
