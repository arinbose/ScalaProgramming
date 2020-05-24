package Basic

/*The difference between them is, that a val is executed when it is defined whereas a lazy val is 
 *executed when it is accessed the first time.
 * https://stackoverflow.com/questions/7484928/what-does-a-lazy-val-do*/
class RandomPoint {
        val x = { println("creating x"); util.Random.nextInt }
        lazy val y = { println("now y"); util.Random.nextInt }
      }
object lazyvals {
  def main (args:Array[String]){
      // val p = new RandomPoint()
      // println(s"Location is ${p.x}, ${p.y}")
    /*As it can be seen, x is printed when it's initialized, but y is not printed when it's 
     *initialized in same way (I have taken x as var intentionally here - to explain when y gets
     *initialized). Next when y is called, it's initialized as well as value of last 'x' is taken 
     *into consideration but not the old one.*/   
      var x = { println("x"); 15 }
      lazy val y = { println("y"); x+1 }
      println("-----")
      x = 17
      println("XXXXXXX") 
      println("y is: " + y)
  }
}