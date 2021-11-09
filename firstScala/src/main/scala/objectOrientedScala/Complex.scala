package objectOrientedScala

class Complex (val re: Int = 0, val im: Int = 0) {
  def + (that: Complex) = new Complex(this.re + that.re, this.im + that.im)

  def - (that: Complex) = new Complex(this.re - that.re, this.im - that.im)

  override def toString = s"${re} + ${im}i"
}
