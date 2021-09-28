object Main {
  def main(args: Array[String]) {
    var i, j = 0;

    while (i <= 10) {
      println(i);
      i += 1;
    }
    println("-------")
    do {
      println(j);
      j += 1;
    } while (j <= 20)
    println("-------")
    for (k <- 1 to 10) {
      println(k)
    }
    println("-------")
    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for (i <- 0 until randLetters.length) {
      println(randLetters(i));
    }
    println("-------")
    val list = List(1, 2, 3, 4, 5)
    for (i <- list) {
      println("List items " + i);
    }
    println("-------")
    val evenList = for {i <- 1 to 20
                        if (i % 2) == 0
                        } yield i
    for (i <- evenList) {
      println(i)
    }
    println("-------")
    for (i <- 1 to 5; j <- 6 to 10) {
      println("i : " + i)
      println("j : " + j)
    }
    println("-------")

    def printPrimes(): Unit = {
      val primeList = List(1, 2, 3, 5, 7, 11)
      for (i <- primeList) {
        if (i == 11) {
          return; // break
        }

        if (i != 1) {
          println(i) // continue
        }
      }
    }

    printPrimes()
  }
}

