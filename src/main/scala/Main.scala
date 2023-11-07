import scala.io.StdIn

object CurrencyExchange {
  def main(args: Array[String]): Unit = {
    var yn: String = ""
    do {
      println("Choose one from the following options")
      println("1) USD to Euro")
      println("2) Euro to USD")
      println("3) Pounds to USD")
      val exchange = StdIn.readInt()

      exchange match {
        case 1 =>
          println("Enter the number of USD")
          val usd = StdIn.readDouble()
          if (usd >= 0) {
            println(s"$usd USD is ${usd * 0.098} Euro")
          } else {
            println("Please input a positive number of USD.")
          }

        case 2 =>
          println("Enter the number of Euro")
          val euro = StdIn.readDouble()
          if (euro >= 0) {
            println(s"$euro Euro is ${euro * 1.101} USD")
          } else {
            println("Please input a positive number of Euro.")
          }

        case 3 =>
          println("Enter the number of Pounds")
          val pounds = StdIn.readDouble()
          if (pounds >= 0) {
            println(s"$pounds Pounds is ${pounds * 1.28} USD")
          } else {
            println("Please input a positive number of Pounds.")
          }

        case _ =>
          println("Invalid choice. Please select a valid option.")
      }

      println("Do you want to continue (press 'y' for yes and 'n' for No)")
      yn = StdIn.readLine()
    } while (yn.equalsIgnoreCase("y"))
  }
}
