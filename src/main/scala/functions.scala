
object Functions {
  def main(array: Array[String]) = {

    /* Structure
     * def funcName(param1:dataType, param2:dataType) : returnType = {
     *     function body
     *     (Optional) return valueToReturn
     * }
     */

    def getSum(num1: Int = 1, num2: Int = 1): Int = {
      num1 + num2;
    }

    def getSum2(args: Int*): Int = {
      var sum: Int = 0
      for (num <- args) {
        sum += num
      }
      sum
    }

    def sayHi(): Unit = {
      println("Hi from procedure")
    }

    def factorial(num: BigInt): BigInt = {
      if(num <= 1)
        1
        else
        num * factorial(num -1)
    }

    println("5 + 4 = " + getSum(num2 = 5, num1 = 4))
    println("Get Sum " + getSum2(1,2,3,4,5,6))
    sayHi()
    println("4! = " + factorial(4))
  }
}

