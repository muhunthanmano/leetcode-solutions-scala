package medium

object Pow {
  def myPow(x: Double, n: Int): Double = {
    iteratePow(x, n.toLong)
  }

  private def iteratePow(x: Double, n: Long): Double = {
    if (n == 0) {
      1
    } else if ( n < 0) {
      1/iteratePow(x, -n)
    } else {
      val lower_result = iteratePow(x, n / 2)
      if (n % 2 == 1) {
        lower_result * lower_result * x
      } else {
        lower_result * lower_result
      }
    }
  }
}
