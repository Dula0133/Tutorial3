object q4 {
  def bookPrice(a:Int):Double=a*24.95

  def discount(amount:Double):Double= amount*.4

  def shippingCost(a:Int):Double=3*a+(a-50)*.75

  def totalWholesaleCost(a:Int):Double= {
    var cost: Double = bookPrice(a) - discount(bookPrice(a)) + shippingCost(a)
    return cost
  }

  def main(args:Array[String]):Unit={
    println("Total wholesale cost for 60 books ="+totalWholesaleCost(60))
  }
}
