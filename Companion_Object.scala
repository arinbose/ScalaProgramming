package Basic

    class ComapanionClass{  
        def hello(){  
            println("Hello, this is Companion Class.")  
        }  
    }  
    object ComapanionClass{  
        def main(args:Array[String]){  
            new ComapanionClass().hello()  
            println("And this is Companion Object.")  
        }  
    }  