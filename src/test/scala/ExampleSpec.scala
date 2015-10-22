import collection.mutable.Stack

class ExampleSpec extends org.scalatest.FunSuite {
  test("addition") {
    val sum = 1 + 1
    assert(sum == 2)
  }
  test("boltzmann") {
    val boltz = new Boltzmann()
    boltz.dist()

  }
}
