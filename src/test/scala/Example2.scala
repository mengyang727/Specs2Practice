import org.specs2.mutable.Specification
class Example2 extends Specification {
  "This is a specification for the 'Hello world!' string".txt

  "The 'Hello world!' string should" >> {
    "contain 11 characters" >> {
      "Hello world!" must haveSize(11)
    }
    "start with 'Hello'" >> {
      "Hello world!" must startWith("Hello")
    }
    "end with '!'" >> {
      "Hello world!" must endWith("!")
    }
  }
}