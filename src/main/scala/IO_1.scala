import scala.io.StdIn.readLine

object IO_1 {
  def main(array: Array[String]) = {
    var numberOfGuesses = 0;

    do {
      print("Guess a number ")
      numberOfGuesses = readLine.toInt
    } while (numberOfGuesses != 15)
    printf("You guessed the secret number %d\n", 15)
  }
}

