package Basic
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
// Catch objects -WE can use Option keyword as well as try
//https://pedrorijo.com/blog/scala-exceptions/
object Exception_Handling {
  def callingFinally{
    println("Calling Finally...")
  }
  def main(args:Array[String]){
    try{
      val f = new FileReader("sample.txt")
    }
    catch{
      case ex:Exception => {
        println("Missing File Error Dynamically Found ")
          ex.printStackTrace
          System.exit(1) //finally wont be called,remove this line to call finally
      }
      //Below is default error
      case _:Throwable =>{
        println("Default Error:")
      }      
    }
    finally {
      callingFinally
    }
  }
}