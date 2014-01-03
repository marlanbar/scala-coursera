package week2

object rationals {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = new Rational(1, 3)                      //> x  : week2.Rational = 1/3
	val y = new Rational(5, 7)                //> y  : week2.Rational = 5/7
	val z = new Rational(3, 2)                //> z  : week2.Rational = 3/2
	x.add(y)                                  //> res0: week2.Rational = 22/21
	x.neg()                                   //> res1: week2.Rational = -1/3
	x.sub(y).sub(z)                           //> res2: week2.Rational = -79/42
}

class Rational(x: Int, y: Int) {
	def numer = x
	def denom = y
	
	def add(that: Rational) =
		new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
		
	def sub(that: Rational) =
		add(that.neg())
		
	def neg() = new Rational(-numer, denom)
	override def toString = numer + "/" + denom
		
}