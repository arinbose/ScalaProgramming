package Basic
//Continuation of trait_example.scala
/*
 * 
    A class can inherit from multiple traits but only one abstract class.
    Abstract classes can have constructor parameters as well as type parameters. Traits can have only type parameters. For example, you can’t say trait t(i: Int) {}; the i parameter is illegal.
    Abstract classes are fully interoperable with Java. You can call them from Java code without any wrappers. Traits are fully interoperable only if they do not contain any implementation code.
 * https://jiaminglin.gitbooks.io/spark-scala-learning-note/content/difference_between_trait_and_abstract_class.html
 * */
abstract class Bird

trait Flying {
    def flyMessage: String
    def fly() = println(flyMessage)
}

trait Swimming {
    def swim() = println("I'm swimming")
}
class Penguin extends Bird with Swimming

class Pigeon extends Bird with Swimming with Flying {
    val flyMessage = "I'm a good flyer Pigeon"
}

class Hawk extends Bird with Swimming with Flying {
    val flyMessage = "I'm an excellent flyer Hawk"
}

class Frigatebird extends Bird with Flying {
    val flyMessage = "I'm an excellent flyer Frigatebird"
}
object trait_example_01 {
  def main (args:Array[String]) = {
    val flyingBirds = List(
    new Pigeon,
    new Hawk,
    new Frigatebird)

    println("flyingBirds:"+flyingBirds.foreach(bird => bird.fly()))

    val swimmingBirds = List(
    new Pigeon,
    new Hawk,
    new Penguin)
    println("swimmingBirds:"+swimmingBirds.foreach(bird => bird.swim()))
    //extra bracket is there in output thats because Unit is returned
   // println (birds.toList)
  }
}