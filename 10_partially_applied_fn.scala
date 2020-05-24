package Basic
/*The Partially applied functions are the functions which are not applied on all the arguments defined 
 *by the stated function i.e, while invoking a function, we can supply some of the arguments and the 
 *left arguments are supplied when required. we call a function we can pass less arguments in it and 
 *when we pass less arguments it does not throw an exception. these arguments which are not passed to 
 *function we use hyphen( _ ) as placeholder. 
 * */
object partially_applied_fn_non_mark_lewis {
  def main (args:Array[String]){
    val pfa = (x:String,y:String) => x + y
    //Below is _ which creates partially applied fn
    val email = pfa(_:String , "@gmail.com")
    println(email("bose"))
  }
}