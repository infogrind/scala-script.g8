package $organization$.$name;format="lower,word"$ 

object HelloWorld {
  def main(args: Array[String]) {
    val exit = run(args);
  }

  def run(args: Array[String]) : Int = {
    // Print a message and the arguments to the application
    println("Hello world!")
    args.foreach(println)
    0
  }
}


class HelloWorld extends xsbti.AppMain {
  def run(configuration: xsbti.AppConfiguration): xsbti.MainResult = {
    new Exit(HelloWorld.run(configuration.arguments))
  }
  class Exit(val code: Int) extends xsbti.Exit
}
