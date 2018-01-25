object PatternMatchPractice {
  def main(args: Array[String]): Unit = {
    new Bubble().bubble(Array(66, 2, 8, 11)) match {
      case Array(2, 8, 11, 66) => println("return 2, 8, 11, 66")
      case _ => println("nothing")
    }
  }
}