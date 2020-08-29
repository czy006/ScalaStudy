package com.gzczy.Day03

import scala.io.StdIn

object InputConDemo {

  def main(args: Array[String]): Unit = {
    val name: String = StdIn.readLine()
    Cat.sayHi()
    Cat.sayHello()
  }

}

object Cat extends AAA{

  def sayHi(){
    println("小狗旺旺叫...")
  }
}

/**
 * trait 在 Scala中我们称呼位特质，等价于java的interface+ abstract class
 */
trait AAA{

  def sayHello(){
    println("AAA Say Hello")
  }
}
