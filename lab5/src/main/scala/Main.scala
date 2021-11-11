object Main extends App {

  val operation = (operation: String) => {
    operation match {
      case "add" => (a: Int, b: Int) => a + b
      case "subtract" => (a: Int, b: Int) => a - b
      case "multiply" => (a: Int, b: Int) => a * b
      case "divide" => (a: Int, b: Int) => a / b
      case "power" => (a: Int, b: Int) => Math.pow(a,b)
    }
  }

  val add = operation("add")
  println(add(5, 2))

  val subtract = operation("subtract")
  println(subtract(5, 2))

  val multiply = operation("multiply")
  println(multiply(5, 2))

  val divide = operation("divide")
  println(divide(5, 2))

  val power = operation("power")
  println(power(5, 2))

}
