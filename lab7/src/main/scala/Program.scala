object Program extends App{


  def divide(a: Int, b: Int) = {
    b match {
      case 0 => None
      case _ => Some(a/b)
    }
  }



  def squareRoot(num: Int) = {
    num match {
      case x if x < 0 => None
      case _ => Some(Math.sqrt(num))
    }
  }


  println("Division")
  println(divide(5,1).getOrElse("Operation Can't be performed"))
  println(divide(5,0).getOrElse("Operation Can't be performed"))

  println("")
  println("SquareRoot")
  println(squareRoot(25).get)
  println(squareRoot(-25).getOrElse("Can't find squareRoot of a negative number"))


  def validValues(seq: Seq[Int]) = seq.map(squareRoot).filter(x => x.isDefined).map(_.get)
  def validValues2(seq: Seq[Int]) = seq.flatMap(squareRoot) // using flatMap

  val seq = Seq(4,9,16,25,-25,-16,-9, -4)
  println(validValues(seq))
  println(validValues2(seq))
}

