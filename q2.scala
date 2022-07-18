object q2 {

  def temperature(celsius: Double): Double = {
    var fahrenheit: Double = celsius * 1.8 + 32
    return fahrenheit
  }

  def main(args:Array[String]):Unit={

    println(temperature(35)+"F")
  }
}
