import scala.collection.mutable.ArrayBuffer

object Arrays {
  def main(array: Array[String]) = {

    val luckyNumbers = new Array[Int](20)
    val comrades = Array("FABER", "PACLA")

    comrades(1) = "MAION"
    println("Comrade " + comrades(1) + " has surpassed us all")

    val comrades2 = ArrayBuffer[String]()
    comrades2.insert(0, "Karl")
    comrades2 += "John"
    comrades2 ++= Array("Dave", "Frederik")
    comrades2.remove(1,2)

    for (comrade <- comrades2)
      println(comrade)

    for(j <- luckyNumbers.indices){
      luckyNumbers(j) = j
      println(luckyNumbers(j))
    }

    val doubleLuckyNumbers = for (num <- luckyNumbers) yield 2 * num
    doubleLuckyNumbers.foreach(println)

    val dividedLuckyNumbers = for (num <- luckyNumbers if num % 4 == 0) yield num
    dividedLuckyNumbers.foreach(println)

    val multiplicationTable = Array.ofDim[Int](10, 10)
    for (i <- 0 to 9){
      for (j <- 0 to 9){
        multiplicationTable(i)(j) = i * j
      }
    }

    for (i <- 0 to 9){
      for (j <- 0 to 9){
        printf("%d * %d = %d\n", i, j, multiplicationTable(i)(j))
      }
    }

    println("Sum : " + luckyNumbers.sum)
    println("Min : " + luckyNumbers.min)
    println("Max : " + luckyNumbers.max)

    val sortedNums = luckyNumbers.sortWith(_>_)

    println(sortedNums.toIndexedSeq.mkString(", "))
  }
}

