package objectOrientedScala

class Animal(val name: String) {
  def eat = println("Animal eats")
  private def privateEat = println("This is a private eat")
}

class Lion(n: String) extends Animal(n){
  def roar = println("Lion Roaring")
  override def eat: Unit = println("Lion Eat")
}