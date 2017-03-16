package pp201701.hw0.test
import pp201701.hw0.submit.main._

object TestSuite extends App {
  def print_result(b:Boolean) : Unit =
    if (b) println("O") else println("X")

  print_result(incr(3) == 4)
  print_result(incr(4) == 6)
}
