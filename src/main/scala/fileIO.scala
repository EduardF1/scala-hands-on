import java.io.{File, PrintWriter}
import scala.io.Source

object fileIO {
  def main(args: Array[String]) {

    val writer = new PrintWriter(new File("test.txt"))
    writer.write(
      "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,\n" +
        "when an unknown printer took a galley of type and scrambled it to make a type \n" +
        "specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, \n" +
        "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset\n" +
        "sheets containing Lorem Ipsum passages, and more recently with desktop publishing \n" +
        "software like Aldus PageMaker including versions of Lorem Ipsum.\n"
    )
    writer.close()

    val textFromFile = Source.fromFile("test.txt", "UTF-8")
    val lineIterator = textFromFile.getLines()

    for(line <- lineIterator)
      println(line)

    textFromFile.close()
  }
}