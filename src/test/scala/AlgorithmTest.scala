import org.scalatest.funsuite.AnyFunSuite

class AlgorithmTest extends AnyFunSuite {

  test("Factorial of 5 should be 120") {
    assert(Algorithm.factorial(5) == 120)
  }

  test("Factorial of 0 should be 1") {
    assert(Algorithm.factorial(0) == 1)
  }

  test("Factorial of 1 should be 1") {
    assert(Algorithm.factorial(1) == 1)
  }
}
