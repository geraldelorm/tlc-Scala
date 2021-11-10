package InheritanceAndTraits

object Program extends App{
  val eqTrade: Trade = new EquityTrade("001", "AMD", 20, 10.0)
  println(eqTrade)

  val fxTrade: Trade = new FXTrade("001", 10.0)
  println(fxTrade)


  val transaction = new Transaction("001", "AMD", 10, 10.0)
  println(transaction.value)
  println(transaction.fee())
//  println(transaction.TaxOnTransaction) // Tax On Transaction is in the amount method
  println(transaction.amount)


  val newTrade = new EquityTrade("001", "GOG", 20, 10)

  val client = new Client("Gerald", "Gbagbe", 0, Silver)

//  val trader = new Trader(client)

  client.addTrade(newTrade);

  println(newTrade.isExecutable(client))
}
