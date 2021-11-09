package objectOrientedScala

class Person private (val first: String,val last: String, age: Int = 21)

object Person{
  def apply(f: String, l: String) = new Person(f, l)
}
