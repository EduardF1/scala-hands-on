object Maps {
  def main(args: Array[String]): Unit ={

    val employees = Map(
      "Manager" -> "Timothy Karleen",
      "Secretary" -> "Jane Alistair",
      "Employee_1" -> "Martin Luther",
      "Employee_2" -> "John Redbrick"
    )

    if(employees.contains("Manager"))
      printf("Manager : %s\n", employees("Manager"))

    val customers = collection.mutable.Map(
      100 -> "Paul Smith",
      101 -> "Tim Corry"
    )

    printf("Customer 1 : %s\n", customers(100))

    customers(100) = "Jenny Doe"
    customers(102) = "Terry Perry"

    for((k,v) <- customers)
      printf("%d : %s\n", k, v)
  }
}