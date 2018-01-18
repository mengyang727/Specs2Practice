import org.specs2.mutable.Specification

class BubbleSpec1 extends Specification{
  "This is a specification for Bubble.scala".txt

  "bubble(Array(66, 2, 8, 11))" should {
    "return 2, 8, 11, 66" in {
      val bubbleTest = new Bubble()
      bubbleTest.bubble(Array(66, 2, 8, 11)) must beEqualTo(Array(2, 8, 11, 66))
    }
  }
}

