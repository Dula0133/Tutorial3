object q5 {
  def easy(x:Int):Int=x*8

  def tempo(x:Int):Int=x*7

  def totalRunningTime():Int= {
    var runningTime = easy(2) + tempo(3) + easy(2)
    return runningTime
  }
  def main(args:Array[String]):Unit= {
    println("Total running time =" + totalRunningTime())
  }

}
