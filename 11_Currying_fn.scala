package Basic

object Currying_fn 
{ 
  
    // Main method 
    def main(args: Array[String]) 
    { 
        // Creating a Partially applied 
        // function 
        def div(x: Double, y: Double)  
        : Double =
        { 
            x / y 
        }      
      // transforming the function that  
      // takes two(multiple) arguments into  
      // a function that takes one(single) argument. 
      def add2(a: Int) = (b: Int) => a + b; 
      // Currying function declaration 
      def add3(a: Int) (b: Int) = a + b; 
      
      // Currying function declaration 
      def add4(a: Int) (b: Int) = a + b; 
      
        // applying currying approach  
        val m = (div _).curried 
        // Displays division 
        println(m(72)(9)) 
        
        println(add2(20)(19)); 
        
        // Partially Applied function. 
        val sum=add4(29)_; 
        println(sum(5)); 
    } 
} 