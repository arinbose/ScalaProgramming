package Basic

/*Let’s consider that f(x) is a function with the following definition.
f(x) = x+1
In a programming language speak calling this function can be defined as Call function/method f(x) with value x. 
Whereas in a mathematical notation, this is usually referred as applying f(x) to value x .*/

/* apply serves the purpose of closing the gap between Object-Oriented and Functional paradigms in Scala. 
 * Every function in Scala can be represented as an object. Every function also has an OO type: for instance,
 * a function that takes an Int parameter and returns an Int will have OO type of Function1[Int,Int].
 * 
 * One confusing element of Scala for beginners is classes that can be constructed without the new 
 * keyword, like this val p = Person(). The reason for this is a special function called the apply 
 * function. In fact it is not actually a constructor, take note: you’ll hear me say this quite a few
 * times (it’s important!).
 * */

class MyAdder(x:Int){
  def apply(y:Int) = x + y
}
object Foo {
  var y = 2
  def apply (x: Int) = x + y
}

/*Another example- apply*/
class Container  {
  //Hidden elements variable
  private val elements = Array("Books","Pens","Laptops")
  def apply(index:Int) = if(index<elements.length) elements(index) else "No element found"
  
}

object apply_example1 {
   def main(args:Array[String])= {
     val adder = new MyAdder(2)
     val result = adder(4) // equivalent to x.apply(4)
     println(result)
     println(Foo (1)) // using Foo object in function notation 
     
     val container = new Container
     println(container(2)) // Laptops
   }
}


