package Basic
/*https://danielwestheide.com/blog/2013/01/02/the-neophytes-guide-to-scala-part-7-the-either-type.html
 * Either works just like Option, with a difference being that with Either you can return a String
 * that describes the problem that occurred.
 *Either has exactly two sub types, Left and Right. If an Either[A, B] object contains an instance of
 *A, then the Either is a Left. Otherwise it contains an instance of B and is a Right.
 * 
 *Try is success-biased: it offers you map, flatMap and other methods that all work under the 
 *assumption that the Try is a Success, and if that’s not the case, they effectively don’t do 
 *anything, returning the Failure as-is.

  The fact that Either is unbiased means that you first have to choose whether you want to work under
  the assumption that it is a Left or a Right. By calling left or right on an Either value, you get 
  a LeftProjection or RightProjection, respectively, which are basically left- or right-biased 
  wrappers for the Either */
object Either_example extends App {
  /**
   * A simple method to demonstrate how to declare that a method returns an Either,
   * and code that returns a Left or Right.
   */
  def divideXByY(x: Int, y: Int): Either[String, Int] = {
      if (y == 0) Left("Dude, can't divide by 0")
      else Right(x / y)
  }
  
  // a few different ways to use Either, Left, and Right
  println(divideXByY(1, 0))
  println(divideXByY(1, 1))
  divideXByY(1, 0) match {
      case Left(s) => println("Answer: " + s)
      case Right(i) => println("Answer: " + i)
  }
}