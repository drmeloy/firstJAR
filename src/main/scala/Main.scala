object Main {
  def main(args: Array[String]): Unit = {
    println("Got arguments")
    args.foreach((arg: String) => println(s"* $arg"))
  }
}
