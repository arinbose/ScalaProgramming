package Basic

object function_object {
  def main(args:Array[String]) {
    //Below is function object
    val myDoubler: Int => Int = doubler 
    //Below is function object
    val abc = myDoubler
    //Calling function object
    println("Calling function object.."+abc(3))
  //Another function object example
  val f = (x: Int) => x + 1 
  //function object call
  println("Function object:"+f(3))
  }
  def doubler(x:Int) = x*2
}