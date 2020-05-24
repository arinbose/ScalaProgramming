package Basic

object VargsList {
  def printReport(names:String*) {
    println(s"""Dont reports=${names.mkString(", ")}""")
  }
  def main(args:Array[String]) {  
  printReport("Vanilla Donut","Strawberry Donut","Glazed Donut")
    printReport()
    printReport("Test1")
    printReport("Test2","Test3")
  }
}