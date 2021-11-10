package PatternMatching

object Main extends App {
  val person = new Person("Gerald", true, "junior")
  val library = new Library
  println(library.borrow(person))
}
