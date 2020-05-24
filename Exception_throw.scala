package Basic

class ExceptionExample2{
  def validate(age:Int)={
    if(age<18) 
      throw new ArithmeticException("You are not eligible")
    else println("You are eligible")
  }
}

object Exception_throw {
  def main(args:Array[String]){
    var e = new ExceptionExample2()
    e.validate(10)
  }
}