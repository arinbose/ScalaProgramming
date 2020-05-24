package Basic

object Lambda_Expression {
   
    //One form of defining
     def square = (x:Double) => x*x
   //def square(x:Double):Double = x*x 
     //Another form of square fn
     val square1: Double => Double = x=> x*x
     //Another form
     val twice:Double => Double = _ * 2
     val lt: (Double,Double) => Boolean = _ < _ 
   def main(args:Array[String]):Unit = {
     println(square(4))
     println(square1(4))
   }
}