//   class Trade private (val id: String, val symbol: String, val quantity: Int, val initialPrice: Double = 0.0) {

case class Trade (val id: String, val symbol: String, val quantity: Int, val initialPrice: Double = 0.0) {
  //require(quantity > 0) //- not recommended to throw an exception in the constructor...

  private var _price = initialPrice //initial price in constructor param
  def price: Double = _price //getter method
  def price_=(value: Double): Unit = { if (value >= 0) _price = value} //setter method

  def value: Double = quantity * initialPrice

//  override def toString:String = s"Trade {id: $id, symbol: $symbol, quantity: $quantity, price: $price}"
}

//object Trade{
//  def apply(id: String, sys: String, quantity: Int, price:Double) = new Trade(id, sys, quantity, price)
//}



// object Trade{
//
//   def apply(id: String, sys: String, quantity: Int, price:Double) = {
//     if (quantity > 0) new Trade(id, sys, quantity, price) else println("Can't create")
//   }
//
// }