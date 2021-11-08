package objectOrientedScala

object main {
  def main(args: Array[String]): Unit = {
    val person = new Person("Gerald", "Gbagbe")
    println(person.first)
    println(person.last)
    println(person.age) // by def it's 35
    person.age = 30; // cos its var, we can change the value
    println(person.age)
    println(person.toString) // overridden toString method

    println(person.isAdult()) // true
    println(person.isAdult(40)) // false cos threshold has been raised

    val person2 = new Person2("Gerald", "Elorm", 23)
    println(person2.name)
    println(person2.now) // def as val nb::val evaluates once at initialization
    println(person.now) // def is evaluated on each call

    println(1.+(1))

  }

  class Person (val first: String, val last: String, var age: Int) {
    def this(f: String, l: String) = {
      this(f, l, 35);
    }
    def isAdult(adultThreshold: Int = 18) = {
      this.age >= adultThreshold
    }

    def now = new java.util.Date().toString

    override def toString = s"$first $last is $age years old"
  }

  class Person2 (f:String, l: String, val age: Int) {
    val name = s"$f $l";

    val now = new java.util.Date().toString // check lazy
  }
}
