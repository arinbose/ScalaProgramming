package Basic

object tryCatch {
  def main (args: Array[String]){
    val str ="123a" //exception as this is string but below is int hence if error occurs then we print it as 0
    val num = try {
              str.toInt  
                  } catch {
                    case ex:NumberFormatException => 0
                    println(ex)
                  }
   println(num) 
   //Below also example of tryCatch
   try{
    //Method for getting score
    var score = -67
    printScore(score)
    println("this line is not executed if exception occurs");
      } catch {
        case e: Exception => println("Exception : " + e);
              } finally{
                println("this line is always executed");
    }

//This method throws an exception if score is negative
def printScore(score: Int) {
    if(score >= 0) 
        println ("Score is: " + score) 
    else 
        throw new IllegalArgumentException("No negative argument is accepted");
                            }
  }
}