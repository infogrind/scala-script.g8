package $organization$.$name;format="lower,word"$ 

class HelloWorld extends xsbti.AppMain {
  def run(configuration: xsbti.AppConfiguration): xsbti.MainResult = {
    val scalaVersion = configuration.provider.scalaProvider.version

    // Print a message and the arguments to the application
    println("Hello world!  Running Scala " + scalaVersion)
    configuration.arguments.foreach(println)

    new Exit(0)
  }
  class Exit(val code: Int) extends xsbti.Exit
}
