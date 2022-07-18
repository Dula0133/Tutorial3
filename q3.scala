object q3 {

  def  volumeOfSphere(r: Double): Double = {
    var volume:Double=(math.Pi*r*r*r*4)/3
    return volume
  }

  def main(args:Array[String]):Unit={
    println(" volume of the sphere ="+volumeOfSphere(5))
  }
}
