package objectOrientedScala

object Program extends App{
  //Complex & Infix operators
  val c1 = new Complex(1, 2)
  println(c1)

  val c2 = new Complex(3, 4)
  println(c2)

  println(c1.+(c2)) // c1 + c2 also works
  println(c2.-(c1)) // c2 - c1 also works

  println("***************************")

  //Class with companion object
  val person = Person("Gee", "Gba") // using the apply method here
  println(person.last)

  // case classes
  val deposit = Cash(100, 0)
  val withdraw = Cash(150, 0)

  println(deposit)
  println(s"Cedis: ${deposit.cedi} and Pesewas: ${deposit.pesewas}")

  val amount3 = deposit.copy()
  println(amount3)
  println(amount3.equals(deposit))

  val amount4 = withdraw.copy( pesewas = 50) // defining our pesewas when coping
  println(amount4)
  println(amount4.equals(withdraw))

  println("***************************")

  //packges with global variables
  println(myPack.packGlobalVal)
  println(myPack.packGlobalDef) //declarations are below

  //imports
//  def importsDateInScope() = {
//    import java.sql.{Date => newDate} // import renamed
//    import java.lang._ // wildcard default imports
//
//    println(newDate)
//  }
//  println(newDate) // wont work - date not in scope
//  importsDateInScope() // will work

}



//Packages
//package myPackage {
//  class AA
//
//  package mySubPackage {
//    class AB1
//    class AB2
//  }
//}

package object myPack {
  val packGlobalVal = 100;
  def packGlobalDef = "Hello world"
}
