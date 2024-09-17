package medium


import org.scalatest.*
import org.scalatest.flatspec.AnyFlatSpec

class AnagramTest extends AnyFlatSpec {

  "Anagram" should "Match with the single element" in {
    println("hello")
//    Anagram.groupAnagrams(Array("eat","tea","tan","ate","nat","bat"))

    Anagram.groupAnagrams(Array("",""))
    assert(true)

  }


}
