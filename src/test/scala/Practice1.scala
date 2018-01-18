import org.specs2._

class Practice1 extends Specification {
  def is =
    s2"""
        The 'Hello World!' string should
          1 contain 11 charaters                $e1
          2 end with '!'                        $e2
      """

  def e1 = "Hello World!" must haveSize(11)
  def e2 = "Hello World!" must endWith("!")
}
