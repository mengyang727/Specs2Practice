import org.specs2.mutable.Specification

class Practice2 extends Specification{
  "This is a specification for the 'Hello Moura!' string".txt

  "The 'Hello Moura!' string" should {
    "contain 11 charaters" in {
      "Hello Moura!" must haveSize(11)
    }

    "start with 'Hello'" in {
      "Hello Moura!" must startWith("Hello")
    }
  }
}
