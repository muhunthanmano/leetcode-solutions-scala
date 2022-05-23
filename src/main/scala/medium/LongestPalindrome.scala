package medium

import scala.annotation.tailrec


class LongestPalindrome {

  def start(string:String): String = {


    val result = iterateOuter(
      string.toArray.map(
        each => each.toByte
      ).toVector
      , Vector(string.head.toByte))

    result.map(
      _.toChar
    ).mkString

  }


  def nonFunctional(string: String): Unit = {

    for(i <- 0 to string.length -2 ) {

      for(j <- i to string.length -2) {

      }

    }

  }



  @tailrec
  private def iterateOuter(string:Vector[Byte], palindromeString:Vector[Byte]): Vector[Byte] = {

    if(string.length <= 1) {

      palindromeString

    } else {

        val currentPalindrome = iterate(string, palindromeString)

        if(currentPalindrome.length >= palindromeString.length) {

          if(currentPalindrome.length >= string.length) {
            currentPalindrome
          } else {
            iterateOuter(string.tail, currentPalindrome)
          }

        } else {

          if(palindromeString.length >= string.length) {
            palindromeString
          } else {
            iterateOuter(string.tail, palindromeString)
          }
        }
    }
  }


  @tailrec
  private def iterate(string:Vector[Byte], palindromeString:Vector[Byte]): Vector[Byte] = {

      if(isPalindrome(string)) string
      else iterate(string.dropRight(1), palindromeString)

  }

  private  def isPalindrome(string:Vector[Byte]): Boolean = {

    val half = string.length / 2
    string.take(half) == string.takeRight(half).reverse

  }
}
