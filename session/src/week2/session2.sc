package week2

object session2 {
 def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:Int): Int =
 	if (a > b) zero
 	else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
  def product(a: Int, b:Int): Int = mapReduce(x => x, (x, y) => x * y, 1)(a, b)
                                                  //> product: (a: Int, b: Int)Int
	def sum(a: Int, b:Int):Int = mapReduce(x => x, (x, y) => x + y, 0)(a, b)
                                                  //> sum: (a: Int, b: Int)Int
	def factorial(n: Int): Int = product(1, n)//> factorial: (n: Int)Int
	
	def gaussian_sum(n: Int): Int = sum(1, n) //> gaussian_sum: (n: Int)Int
	factorial(5)                              //> res0: Int = 120
	gaussian_sum(100)                         //> res1: Int = 5050
	
}