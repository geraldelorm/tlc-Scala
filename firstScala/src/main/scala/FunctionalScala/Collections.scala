package FunctionalScala

object Collections extends App {
  //Tuples
  val myTuple = (1,3)
  println(myTuple)

  val pairTuple = "Gerald" -> 31 // this is also a tuple
  println(pairTuple)

  /*
  ###DFF B/N traversable and Iterable

  One point that does sometimes cause confusion is the difference
  between the two base types Traversable and Iterable.
  Both define some form of iteration through the elements of a collection.
  However with Traversable, the collection controls the iteration and
  with Iterable the client controls the iteration.
  Traversable defines a single method, foreach, that returns each element.
  Iterable provides iteration based on a separate Iterator object,
  which allows a client to fetch an element when required.

  This distinction is sometimes called Internal vs External iteration.
  Allowing internal iteration gives the collection the
  potential to perform its own resource management, which may be more
  appropriate than relying on clients to do so through external iteration.
  */

  // Everything is by default immutable - therefore every operation returns a new collections

  val v1  = Vector(1, 2, 3, 4, 5)
  println(v1)

  val s1 = Seq(1, 2, "Hello", 5)
  println(s1)

  val a1 = Array(1, 2, 3)
  println(a1(0), a1(2))

  val s = Seq(1, 2, 3, 4)
  println(s.length)
  println(s.indices)
  println(s)
  println(s.reverse)
  println(s.contains(9))
  println(s.contains(3))

  println(s :+ 5)
  println(0 +: s) // right binding

  println(s ++ Seq(4, 6, 7, 8))

  println(s.count(_ > 2)) // same as s.count(x => x > 2)

  println(List("Set", "Abi", "Manuel", "Zayn").sortWith(_.compareTo(_) < 0))
  println(List("Set", "Abi", "Manuel", "Zayn").sortWith(_.compareTo(_) < 0).reverse)

  //mutable sequences
  val mSeq = scala.collection.mutable.Seq(1, 2, 3, 4 ,5 , 6)
  println(mSeq)
  mSeq(0) = 48972893 //mutated the original sequence.
  println(mSeq)

  //SETS
  val set = Set(1, 1, 3, 4, 5) // duplicate will be removed = (1, 3, 4 ,5)
  println(set)
  println(set.contains(4))
  println(set & Set(3, 5, 9)) // intersection = return common elements b/n the two sets
  println(set | Set(3, 5, 9)) // union - with duplicated removed
  println(set &~ Set(3, 5, 9)) // difference

  println(set + 100) // appends 100 to the set

  //Maps i.e (Key, Value) pairs
  val caps = Map ("UK" -> "London", "GHANA" -> "Accra", "USA" -> "Washington DC")
  println(caps)
  println(caps.keys)
  println(caps.values)
  println(caps("GHANA")) // throws exception if key is not found

  println(caps.get("TOGO")) // returns None if key is not found
  println(caps.get("UK"))
  println(caps.getOrElse("SA", "Not Found")) // we pass in what is to be returned when key is not found as well.


  //WORKING WITH COLLECTIONS - ie Streaming "LOL :)"


}
