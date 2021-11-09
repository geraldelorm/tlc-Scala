case class Trade (val id: String, val symbol: String, val quantity: Int, val initialPrice: Double) {
  //require(quantity > 0) - not recommended to throw an exception in the constructor...

  private var _price = initialPrice //initial price in constructor param
  def price: Double = _price //getter method
  def price_=(value: Double): Unit = { if (value >= 0) _price = value} //setter method

  def value: Double = quantity*price

//  override def toString:String = s"Trade {id: $id, symbol: $symbol, quantity: $quantity, price: $price}"

}

//object Trade{
//  def apply(id: String, sys: String, quantity: Int, price: Double) = new Trade(id, sys, quantity, price)//
//}