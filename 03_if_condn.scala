package Basic

object if_condn {
  var i=0
  var age=19
  def main(args:Array[String]):Unit = {
      while (i<10) {
        println(i)
        i += 1 
      }
     val response= if (age < 18) {
         "No admittance "
      } else {
        "Come in"
      }
     println(response);
     //for expression
    val stuff= for {i <- 0 until 10 
                    if i%3==0 || i%5 ==0 
                    sqr = i*i   
                    j <- 'a' to 'c'
                    } yield
    {
      i -> j //This line creates tuples
      //j -> sqr //This line also creates tuples ,either above line or this one
    }
    println(stuff)          
   val nums = Seq(1,2,3)
   val letters = Seq('a','b','c')
   val res = for {
        n <- nums
        l <- letters
      } yield (n,l)
   println(res)
  }
}