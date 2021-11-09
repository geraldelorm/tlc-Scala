import java.time.LocalDate

object Main extends App {
//TRADE
  val trade = Trade("001", "AMD", 200, 0.0)
  println()
  println(trade)
  trade.price_=(50.09)

  println(trade.price)
  println(trade.value)

  println("")
  println("************")
  println("")

  println(trade.price)
  trade.price_=(10.0)
  println(trade.price)

  println("")
  println("************")
  println("")

  val trade2 = Trade("002", "GOG", 10, 25)
  println(trade2.hashCode())

//PERSON
  val person = new Person("Gerald", "Gbagbe", LocalDate.of(1998, 12, 1))
  println(person.age)

}
