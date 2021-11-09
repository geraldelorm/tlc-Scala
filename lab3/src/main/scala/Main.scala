object Main extends App{

  val trade = Trade("001", "AMD", 200, 500)
  println(trade)
  trade.price = 50.09
  println(trade)
  println(trade.value)

  println("")
  println("************")
  println("")

  val trade2 = Trade("002", "GOG", 10, 25)
  println(trade2.hashCode())

}
