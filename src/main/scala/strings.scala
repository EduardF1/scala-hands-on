
object Strings {
  def main(array: Array[String]) = {

    val randSentence = "In the trenches, boys become men."

    println("3rd index : " + randSentence(3))
    println("Sentence length : " + randSentence.length)
    println(randSentence.concat(" And they're never the same..."))
    println("'trenches' starts at index " + randSentence.indexOf("trenches"))

    val randSentenceArray = randSentence.toArray
    for(v <- randSentenceArray)
      println(v)
  }
}

