import java.io.PrintWriter
import scala.math.log10

object Hof {
  def main(args: Array[String]){

    val log10Func = log10 _
    println(log10Func(1000))
    List(1000.0, 10000.0).map(log10Func).foreach(println)
    List(1,2,3,4,5).map((x:Int) => x * 50).foreach(println)
    List(1,2,3,4,5).filter(_ % 2 == 0).foreach(println)

    def times3(num : Int) = num * 3;
    def times4(num: Int)=num * 4;
    def multiplyIt(func : (Int) => Double, num : Int) = {
      func(num)
    }

    printf("3 * 100 = %.1f\n", multiplyIt(times4, 100))

    val divisorVal = 5
    val divisor5 = (num: Double) => num / divisorVal

    println("5 / 5 = " + divisor5(5.0))

  }
}