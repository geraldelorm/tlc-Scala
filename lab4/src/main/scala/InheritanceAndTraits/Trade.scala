package InheritanceAndTraits

abstract class Trade (val id: String, val initialPrice: Double = 0.0) {

  private var _price = initialPrice //initial price in constructor param
  def price: Double = _price //getter method
  def price_=(value: Double): Unit = { if (value >= 0) _price = value} //setter method


  def isExecutable

//  override def toString:String = s"Trade:  {id: $id,, price: $price}"
}


class EquityTrade(id: String, val symbol: String,val quantity: Int, initialPrice: Double = 0.0)
  extends Trade(id, initialPrice) {

  override def isExecutable = true

  def value: Double = quantity * initialPrice

  override def toString:String = s"Trade: Equity Trade {id: $id, symbol: $symbol, quantity: $quantity, price: $price}"
}

class FXTrade(id: String, initialPrice: Double = 0.0) extends Trade(id, initialPrice) {
  override def isExecutable = false

  override def toString:String = s"Trade: FX Trade {id: $id, price: $price}"
}

trait FeePayable {
  def fee() = 10.0
}

trait Taxable {
  def tax() = 0.125
}