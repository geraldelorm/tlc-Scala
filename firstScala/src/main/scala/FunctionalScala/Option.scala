package FunctionalScala

import FunctionalScala.Collections.caps

object Option {
  def main(args: Array[String]): Unit = {
    val caps = Map ("UK" -> "London", "GHANA" -> "Accra", "USA" -> "Washington DC")

    //Option[T]
    val noVal: Option[String] = None
    val aVal: Option[String] = Some("Hello")
    val nestedOpt: Option[Option[String]] = Some(Some("World"))

    println(aVal.get)
    // println(noVal.get) //error
    println(noVal.getOrElse("No value"))

    println(caps.get("USA"))
    println(caps.get("TOGO")) // none

    //lets use a function
    def getCapitals (c: String) = caps.get(c) match {
      case Some(s) => s
      case None => "NO MATCHES FOUND"
    }

    println(getCapitals("Ghana"))
    println(getCapitals("GHANA"))

    val list1 = List(Some("Somali"), None, Some("Ethiopia"))
    println(list1)
    println(list1.flatten)

    val countries = List("UK", "USA", "GHANA")
    println(countries.map(c => caps.get(c)))
    println(countries.flatMap(c => caps.get(c)))

    //for comprehension
    val compre = for (c <- countries; cap <- caps.get(c)) yield (c, cap)
    println(compre)

  }

}
