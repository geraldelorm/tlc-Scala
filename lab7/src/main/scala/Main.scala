class ListOfAny(val listOfAny: List[Any]) {
  def count = listOfAny.length
  def contains(elem: Int) = listOfAny.contains(elem)
  // We have not given up its to be continued
//  def sum = listOfAny match {
//    case listOfInt: List[Int] => listOfInt.sum
//    case listOfInt: List[Double] => listOfInt.sum
//    case listOfInt: List[_] => listOfInt.concat(" ")
//  }

  def add(elem: Int) = listOfAny :+ elem
}
object Main extends App{
  val newList = new ListOfAny(List(1.0, 2.0, 3.0, 4.0, 5.0, 6.0 ,7.0 ))
  println(newList.count)
  println(newList.contains(50))
//  println(newList.sum)
  println(newList.add(78))
}
