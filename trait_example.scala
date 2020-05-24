package Basic
/*A trait is like a partially implemented interface that can hold abstract and non-abstract methods. They’re like Java interfaces; that is what Scala compiles them into.*/
/* MAKE EXAMPLE PROPER FROM HERE http://joelabrahamsson.com/learning-scala-part-seven-traits/ */

/*Below is only with abstract class
 *The flyMessage field is abstract 
 * */
abstract class Bird_init {
    def flyMessage: String
    def fly() = println(flyMessage)
    def swim() = println("I'm swimming")
}

class Pigeon_init extends Bird_init {
    val flyMessage = "I'm a good flyer"
}

class Hawk_init extends Bird_init {
    val flyMessage = "I'm an excellent flyer"
}
/*Above is only with abstract class below we will see trait based*/


object trait_example {
  def main (args:Array[String]){
    val birds = List(
    new Pigeon_init,
    new Hawk_init)

    println("Normal Abstract Bird Example:"+birds.foreach(bird => bird.fly()))
    //extra bracket is there in output thats because Unit is returned
    // println (birds.toList)
  }
}