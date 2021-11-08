object Monday {
  def main(args: Array[String]): Unit = {
    println("hello Monday")

    var person2: Person = new Person()
    println(person2.firstName)

    val person: Person = new Person("Elorm", "Gbagbe")
    println(person.firstName)

    val myVal: Int = 10
//     myVal + 20; val is immutable

    var myVar = 10
//    var is mutable
    myVar = 20
    println(myVar, myVal)

    val y: String = "Gerald"

    val x = {val a = 5; a + 5}
    println(x)

//    def times2(i: Int): Unit = i*2  ----  no need to specify return type
    def times2(i: Int) = i*2
    println(times2(20))

    def toUpper(string: String*) = string.map(_.toUpperCase())
    println(toUpper("gerald", "elorm", "gbagbe"))

    def sayhello = println("Hello ") //functions with n o params can ignore the ()
    sayhello // function calls can also ignore the ()

    //strange naming in scala
    def **(i:Int) = i*i*i
    println(**(5))

    def ?(i: Int) = i%2 == 0
    println(?(5), ?(10))

    def `a*b`(a:Int, b:Int) = a*b
    println(`a*b`(10, 10))

    // Strings
    val str1 = "1\t2\t\t\t3"
    println(str1)

    val str2 = """1\t2\t\t\t3"""
    println(str2)

    //s = interpolation f= formatting raw= raw String
    val a = 1
    val b = 1
    val c = 1
    println(s"$a + $b + $c = ${a+b+c}")
    println(f"$a%2d + $b%2d  + $c%2d  = ${a+b+c}")

    println(raw"    a **** ddd")


    //REGEX
    val order = "My name is Gerald"
    println(order)
    println(order.matches(".* Gerald"))
    println(order.matches("Gerald .*"))
    println(order.matches(".* name .*"))

    val newOrder = order.replace("Gerald", "Elorm")
    println(newOrder)

    val newOrder2 = order.replaceAll("[nN]ame", "first name")
    println(newOrder2)


    //Complex regex stuff - Capture Groups
    val sent = "A new black and white chair"
    val sent2 = "A new green and yellow chair"

    val capture = raw".* (black|green) and (white|yellow) .*".r

    val capture(firstColor, secondColor) = sent;
    println(firstColor, secondColor)

    val capture(firstColor2, secondColor2) = sent2;
    println(firstColor2, secondColor2)


    // Conditionals
    val num = 200
    if (num > 100) println("more than 100") else println("less of equal 100")


    def checkLarger(num1: Int, num2:Int ) =
      if (num1 > num2)
        {
          println(num1 + " is larger")
        }
      else if (num2 > num1)
        {
          println(num2 + " is larger")
        }
      else {
        println("They are equal")
      }

    checkLarger(5, 10)


    //match cases
    val mouth = 2
    mouth match {
      case 1 => println("Jan")
      case 2 => println("Feb")
      case 3 => println("Mar")
      case 4 => println("Apr")
      case 5 => println("May")
      case 6 => println("Jun")
      case 7 => println("Jul")
      case 8 => println("Aug")
      case 9 => println("Sep")
      case 10 => println("Oct")
      case 11 => println("Nov")
      case 12 => println("Dec")
    }

    val mouth2 = 9
    mouth2 match {
      case 1 | 2 | 3 => println("First Quarter")
      case 4 | 5 | 6 => println("Second Quarter")
      case i if (i > 6 || i < 10) => println("Third Quarter") // that is also possible
      case 10 | 11 | 12 => println("Fourth Quarter")
    }


    /// while loop
    var f = 5 // note var not val
    while (f != 0) {
      println(f)
      f -= 1
    }

    //for loop
    for (a <- 1 to 10) println(a + " in for loop")

    //for each
    (10 to 20) foreach (println(_))
//    (10 to 20).foreach (println(_)) this also works

  }
}
