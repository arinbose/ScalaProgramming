package Basic

object Higher_Order_Function {
    def main(args: Array[String]) = {
      functionByExample(25,multiplyBy2)
    }
    def functionByExample(a:Int,f:Int=>AnyVal):Unit = {
      print(f(a))
    }
    def multiplyBy2(a:Int):Int = {
      a*2
    }
}