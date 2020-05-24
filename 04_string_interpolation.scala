package Basic

object string_interpolation {
  val name = "Pat Cook"
  val value = 42
  val age = 22
  
  //both same output
  val message = name + " is " + age + " years old."
  val message2 = s"$name is $age years old."
  
  val message3 = s"$name is ${age+1} years old."
  def main(args:Array[String]):Unit = {
  
  
  println(message)
  println(message2)
  println(message3)
  }
}