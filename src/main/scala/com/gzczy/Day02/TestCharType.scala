package com.gzczy.Day02

object TestCharType {
  def main(args: Array[String]): Unit = {
    var name:String = "czy"
    var age:Int = 23
    //（1）字符串，通过+号连接
    println(name+" " +age)

    //（2）printf用法字符串，通过%传值。
    printf("name=%s age=%d\n",name,age)

    //（3）字符串，通过$引用,注意：前面的小s不能删除
    println(s"name=$name age=$age")

    println(
      s"""
             name=${name}
             age=${age}
             """
    )
  }
}
