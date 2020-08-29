package com.gzczy.Day02

object TestSpecialType {
  def main(args: Array[String]): Unit = {

    def test() : Nothing={
      throw new Exception()
    }
    test
  }
}
