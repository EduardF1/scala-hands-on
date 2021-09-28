object Exceptions {
  def main(args: Array[String]) {

    def divideNumbers(num1: Int, num2: Int) = try {
      num1 / num2
    } catch {
      case ex: java.lang.ArithmeticException => "Cannot divide by zero"
    } finally {
      println("Execution terminated.")
    }

    println("3 / 0 = " + divideNumbers(3, 0))
  }
}