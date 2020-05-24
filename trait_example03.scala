package Basic
//Scala Trait having abstract and non-abstract methods
/*You can also define method in trait as like in abstract class. I.e. you can treat trait as abstract 
 *class also. In scala, trait is almost same as abstract class except that it can't have constructor. 
 *You can't extend multiple abstract classes but can extend multiple traits.*/
    trait Printable_1{  
        def print()         // Abstract method  
        def show(){         // Non-abstract method  
            println("This is show method")  
        }  
    }  
      
    class A6_1 extends Printable_1{  
        def print(){  
            println("This is print method")  
        }  
    }  
      
    object MainObject{  
        def main(args:Array[String]){  
            var a = new A6_1()  
            a.print()  
            a.show()  
        }  
    }  