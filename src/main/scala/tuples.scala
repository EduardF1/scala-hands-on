object Tuples {
  def main(args: Array[String]): Unit = {

    val tuple1 = (103, "Obi-wan Kenobi", 10.25)

    printf("%s owes us $%.2f\nHe might need to sell his lightsaber.\n", tuple1._2, tuple1._3)

    tuple1.productIterator.foreach { i => println(i) }

    println(tuple1.toString())
  }
}