package InheritanceAndTraits

class Transaction(id: String, symbol: String, quantity: Int, initialPrice: Double = 0.0)
  extends EquityTrade(id, symbol, quantity, initialPrice) with FeePayable with Taxable {

  def amount:Double = {
    val amountWithoutTax = this.value + fee()
    val TaxOnTransaction = amountWithoutTax * tax()

    amountWithoutTax + TaxOnTransaction
  }

}
