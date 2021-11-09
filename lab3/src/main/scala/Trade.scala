case class Trade (val id: String, val symbol: String, val quantity: Int, val initialPrice: Double) {

  private var _price = initialPrice //initial price in constructor param
  def price: Double = _price //getter method
  def price_=(value: Double): Unit = { if (value >= 0) _price = value} //setter method

  def value = quantity*price

//  override def toString:String = s"{id: $id, symbol: $symbol, quantity: $quantity, price: $price}"
}


//
//object Trade{
//  def apply(id: String, sys: String, quan: Int, price: Double) = new Trade(id, sys, quan, price)
//
//}