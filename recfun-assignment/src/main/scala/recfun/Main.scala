package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
	if (c == 0 || c == r) 1
	else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   * chars.isEmpty: Boolean returns whether a list is empty
   * chars.head: Char returns the first element of the list
   * chars.tail: List[Char] returns the list without the first element
   */
  def balance(chars: List[Char]): Boolean = { 
    def innerBalance(chars: List[Char]): Boolean =
	  if (chars.isEmpty) false 
	  else if (chars.head == ')' ) true else innerBalance(chars.tail)
	  
	def balanceAcc(acc: Int, chars:List[Char]): Boolean = 	  
	  if (chars.isEmpty) true
	  else if (chars.head == '(') innerBalance(chars.tail) && balanceAcc(acc + 1, chars.tail)
	  else if (chars.head == ')') (acc != 0) && balanceAcc(acc - 1, chars.tail)
	  else balanceAcc(acc, chars.tail)
	balanceAcc(0, chars)
  }  

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = 
    if (money < 0) 0
    else if (money > 0 && coins.isEmpty) 0
    else if (money == 0) 1
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
}