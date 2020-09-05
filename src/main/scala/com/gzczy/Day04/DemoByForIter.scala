package com.gzczy.Day04

object DemoByForIter {

  def main(args: Array[String]): Unit = {
    demo1()
    println("-----------------------------")
    demo2()
    println("-----------------------------")
    demo3()
    println("-----------------------------")
    demo4()
    println("-----------------------------")
    demo5()
    println("-----------------------------")
    demo6()
    println("-----------------------------")
    demo7()
    println("-----------------------------")
  }

  def demo1() {
    val start = 1
    val end = 10

    /**
     * 说明：1.Start 从哪个数开始循环
     * 2.to 是关键字
     * 3.end 循环结束的值
     * 4.start to end 表示前后闭合
     */

    for (i <- start to end) {
      println("Hello World " + i)
    }
    //使用这种for循环推导时候，也可以直接对集合进行遍历
    val list = List("hello", 10, 30, "tom")
    for (item <- list) {
      println("item=" + item)
    }
  }

  def demo2() {
    // until关键词
    val start = 1
    val end = 10
    for (i <- start until end) {
      println("Hello world" + i)
    }
  }

  def demo3() {
    // 说明：by表示步长
    for (i <- 1 to 10 by 2) {
      println(i)
    }
  }

  def demo4() {
    //循环嵌套
    for (i <- 1 to 3; j <- 1 to 3) {
      println(" i =" + i + " j = " + j)
    }

    //等价于 下面这段代码
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println("i =" + i + " j=" + j)
      }
    }
  }

  def demo5(){
    // 循环守卫 i=2 不会被输出
    for (i<- 1 to 10 if i!=2){
      println(i+"")
    }
    println()
  }

  def demo6(){
    // 引入变量
    for(i<- -1 to 3;j=4-i){
      println(j)
    }
  }

  /**
   * 1. 对 1 to 10 进行遍历操作
   * 2. yield 操作将每次循环得到的i放入vector集合中，并返回给res
   * 3. i 这里是一个代码块，意味着我们可以对i进行处理
   * 4.下面这个方式 就体现出Scala一个重要的语法点，就是将一个集合中各个数据进行处理并且返回给新的集合
   */
  def demo7(){
    val res = for (i<- 1 to 10) yield {
      if (i%2 ==0){
        i
      }else{
        "不是偶数"
      }
    }
    println(res)
  }
}
