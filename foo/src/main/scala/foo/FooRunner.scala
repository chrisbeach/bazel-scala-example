package foo

import bar.Bar.bar

object FooRunner extends App {
  println(Foo.message)
}

object Foo {
  val message = s"Foo $bar"
}