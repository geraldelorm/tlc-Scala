package FunctionalScala

object Functions extends App {
  println("Functional Programming in Scala")

  val doubleIt = (n: Int) => n * 2;
  println(doubleIt(4))

  //passing functions as arguments
  val doIt = (n: Int, f: (Int => Int)) => f(n)
  println(doIt(5, doubleIt))

  val squareIt = (n: Int) => n*n
  println(doIt(5,squareIt))

  println(doIt(5, (x => x + 1))) // functional literals ie anonymous functions
  println(doIt(5, (_ + 1))) // same thing as whats above

  //returning functions
  val multiBy = (n: Int) => ((x: Int) => x * n)

  // we can assign the function returned to a variable
  val doubleItAgain = multiBy(2)
  println(doubleItAgain(4)) // the assigned variable can accept x as its param

  val tripleIt = multiBy(3) // so multiBy generates and returns a function
  println(tripleIt(4))

  val f = (x: Int) => x + 2
  val g = (x: Int) => x * 2
  println(f(2))
  println(g(2))

  val h = f compose g // same as f.compose(g)
  println(h(2))

  val j = f.andThen(g)
  println(j(2))

  //Closure
  var external = 100

  def foo(n: Int) = n * external
  println(foo(5))

  external = 200
  println(foo(5)) // closure in action - the function encloses the variable not just the value

  //functions and methods are not the same
  class AClass(data: String) {
    def aMethod(i: Int) = data + ": " + i
  }

  val obj = new AClass("Some Data")
  println(obj.aMethod(5))

  //we can assign method to variables - making them functions
  val func: Int => String = obj.aMethod
  println(func(5))


}
