package Basic
/*A class which is declared with abstract keyword is known as abstract class. 
 *An abstract class can have abstract methods and non-abstract methods as well. Abstract class is used to 
 *achieve abstraction. 
 *Abstraction is a process in which we hide complex implementation details and show only functionality to 
 *the user.
 *In scala, we can achieve abstraction by using abstract class and trait 
 *A class that extends an abstract class must provide implementation of its all abstract methods. */
abstract class Bike_abstract(a:Int){             // Creating constructor  
    var b:Int = 20                      // Creating variables  
    var c:Int = 25  
    def run()                           // Abstract method  
    def performance(){                  // Non-abstract method  
        println("Performance awesome")  
    }  
}  
  
class Hero(a:Int) extends Bike_abstract(a){  
    c = 30  
    def run(){  
        println("Running fine...")  
        println("a = "+a)  
        println("b = "+b)  
        println("c = "+c)  
    }  
}  
object abstract_class {
   def main(args: Array[String]){  
        var h = new Hero(10)  
        h.run()  
        h.performance()    
    }  
} 


/*    abstract class Bike{  
        def run()               // Abstract method  
    }  
      
    class Hero extends Bike{        // Not implemented in this class  
        def runHero(){  
            println("Running fine...")  
        }  
    }  
      
    object MainObject{  
        def main(args: Array[String]){  
            var h = new Hero()  
            h.runHero()  
        }  
    }  
    OUTPUT:  
    error: class Hero needs to be abstract, since method run in class Bike of type ()Unit is not defined
    class Hero extends Bike{
      ^
    one error found
 * */
