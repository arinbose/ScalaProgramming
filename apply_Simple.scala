package Basic

//https://blog.matthewrathbone.com/2017/03/06/scala-object-apply-functions.html
/*This is really done with some compile time sugar which translates function calls to Greet() into calls to 
 *Greet.apply(). So really the apply function is a simple short-hand that lets you save a few characters.
  
  Scala however loves the apply function, and so it is used in several interesting ways. Here are 4 interesting ways
  you can use (or do use) the apply() function in Scala.*/
object Greet {
 def apply(name: String): String = {
   "Hello %s".format(name)
 }
}

object apply_example {
  def main(args: Array[String]) {
  // I can call apply explicitly if I want:
  println(Greet.apply("bob"))
  // => "Hello bob"
  
  // Or I can call Greet like it is a function:
  println(Greet("bob"))
  // => "Hello bob"
  }
}