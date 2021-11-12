package FunctionalScala

import scala.annotation.tailrec

object Recursion extends App{
  //regular recursion

  def factorial(n: Int): BigInt =
    if (n == 0) 1 else n * factorial(n -1)

  println(factorial(5))
  //println(factorial(100000)) // Error: java.lang.StackOverflowError

  // Tail recursion
  @tailrec def factorial2(n: Int, holder: BigInt = 1): BigInt =
    if(n == 0 ) holder else factorial2(n -1, n * holder)

  //println(factorial2(100000)) // works now - produces a really big number

  // Tail recursion - made better to keep function param as 1
  def factorial3(n: Int): BigInt = {
    def fact(n: Int, holder: BigInt) =
      if(n == 0 ) holder else factorial2(n -1, n * holder)
    fact(n, 1)
  }

  println(factorial3(1000)) // works just fine


  //Pass By Value
  def showTheTime(t : java.util.Date) = {
    println(s"The time is $t")
    Thread.sleep(2000)
    println(s"The time is $t")
  }

  println("Pass By Value")
  showTheTime(new java.util.Date) // time remain the date even after sleep

  //Pass By Name
  def showTheTime2(t : => java.util.Date): Unit = {
    println(s"The time is $t")
    Thread.sleep(2000)
    println(s"The time is $t")
  }

  println("Pass By Name")
  showTheTime2(new java.util.Date) // time changes becos eveluation is done on each call

  //Currying Methods
  def multi(a:Int)( b:Int) = a * b
  println(multi(2)(3))

  val multiBy = multi(5)_
  println(multiBy(30))

  //Currying methods


  //Partial Functions
}
