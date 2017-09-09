package foo

import org.scalatest.{Matchers, WordSpec}

class FooTest extends WordSpec with Matchers {
  "Foo" should {
    "concatenate 'Foo' and 'bar'" in {
      Foo.message should be("Foo bar")
    }
  }
}