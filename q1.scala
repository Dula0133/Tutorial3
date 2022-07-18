object q1 {

  def areaOfDisk(r: Double): Double = {
    var area:Double=math.Pi*r*r
    return area
  }

  def main(args:Array[String]):Unit={
    println("Area of the disk ="+areaOfDisk(5))
  }
}
