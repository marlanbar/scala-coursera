package week2
import math.abs

object session3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	val tolerance = 0.0001                    //> tolerance  : Double = 1.0E-4
  def isGoodEnough(x: Double, y: Double): Boolean = abs((x - y) / x)/ abs(x) < tolerance
                                                  //> isGoodEnough: (x: Double, y: Double)Boolean
	def fixedPoint(f: Double => Double)(firstGuess: Double) = {
		def iterate(guess: Double): Double = {
			val next = f(guess)
			if (isGoodEnough(guess, next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	}                                         //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double

	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
	
	def sqrt(x: Double) = fixedPoint(averageDamp(y => x / y))(1)
                                                  //> sqrt: (x: Double)Double
	sqrt(2)                                   //> res0: Double = 1.4142135623746899
}