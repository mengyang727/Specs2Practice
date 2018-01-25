import org.specs2.mutable.Specification
import org.specs2.specification.Scope

class BubbleSpec extends Specification{
//  "This is a specification for Bubble.scala".txt
//
//  "bubble(Array(66, 2, 8, 11))" should {
//    "return 2, 8, 11, 66" in {
//      val bubbleTest = new Bubble()
//      bubbleTest.bubble(Array(66, 2, 8, 11)) must beEqualTo(Array(2, 8, 11, 66))
//    }
//  }

  "#bubble" should {
    "return 2, 8, 11, 66" in new BubbleScope {
      bubble.bubble(Array(66, 2, 8, 11)) must beEqualTo(Array(2, 8, 11, 66))
    }
  }

  "#bubbleRecursion" should {
    "return 2, 8, 11, 66" in new BubbleScope {
      bubble.bubbleRecursion(Array(66, 2, 8, 11)) must beEqualTo(Array(2, 8, 11, 66))
    }
    "return Array()" in new BubbleScope {
      bubble.bubbleRecursion(Array()) must beEqualTo(Array())
    }
  }

  "#bubblePatternMatch" should {
    "return 5, 6, 7, 8" in new BubbleScope {
      bubble.bubblePatternMatch(List(6, 5, 8, 7), Nil) must beEqualTo(List(5, 6, 7, 8))
    }
    "return Nil" in new BubbleScope {
      bubble.bubblePatternMatch(Nil, Nil) must beEqualTo(Nil)
    }
  }

  trait BubbleScope extends Scope {
    val bubble = new Bubble()
  }
}

