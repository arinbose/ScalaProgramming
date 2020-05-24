package Basic

// a class/object to demonstrate how to pass a function
// to another function in scala
object Passing_fn_as_param {
    // this function takes another function as an argument.
  // that function takes no args, and doesn't return anything.
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread.sleep(1000) }
  }

  // the function we'll pass in to oncePerSecond.
  // this can be any function that takes no args and doesn't
  // return anything.
  def timeFlies() {
    println("time flies like an arrow ...")
  }

  // the main() method, where we pass timeFlies into oncePerSecond.
  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}