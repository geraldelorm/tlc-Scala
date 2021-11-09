import org.scalatest.funsuite.AnyFunSuite

class TradeTest extends AnyFunSuite{
  val trade = new Trade("001", "AMD", 2, 5.0)
  test("trade.value"){
    assert(trade.value === 10.0)
  }

  // case class implements all the following
  test("trade.toString"){
    assert(trade.toString === "Trade(001,AMD,2,5.0)")
  }

  test("trade.equals"){
    assert(trade.equals(trade) === true)
  }

  test("trade.hashcode"){
    assert(trade.hashCode === 581284534)
  }
}