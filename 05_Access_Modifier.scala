package Basic

/*Following table contains information about accessbilty of access modifiers.
Modifier 	              Outside package 	Package 	Class 	Subclass 	Companion
No access modifier          	Yes 	        Yes 	   Yes     	Yes 	    Yes
Protected 	                  No 	           No 	   Yes 	    Yes 	    Yes
Private 	                    No 	           No 	   Yes 	    No 	      Yes
*/
class AccessExample{  
     protected var a:Int = 10  
}  
class SubClass extends AccessExample{  
    def display(){  
        println("a = "+a)  
    }  
}  
object Access_Modifier {
  def main(args:Array[String]){  
        var s = new SubClass()  
        s.display()  
    } 
}