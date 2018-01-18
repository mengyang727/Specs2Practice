import org.specs2.Specification

class BubbleSpec2 extends Specification{
  def is =
    s2"""
      'bubble(Array(66, 2, 8, 11)) should'
        "return 2, 8, 11, 66"               $e1
    """
  def e1 = new Bubble().bubble(Array(66, 2, 8, 11)) must beEqualTo(Array(2, 8, 11, 66))
}
