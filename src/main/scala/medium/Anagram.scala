package medium

//https://leetcode.com/problems/group-anagrams/description/
object Anagram {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    println(strs.toSeq)


    println(iterateAnagrams(strs, List.empty))
    List.empty
  }

  def iterateAnagrams(strs: Array[String], result:List[List[String]] ): List[List[String]] = {
    if (strs.isEmpty) {
      result
    } else {
      val head = strs.head
      val tails = strs.tail

      val matchingResult = tails.filter(
        charMatching(head, _)
      )

      iterateAnagrams(
        if (matchingResult.isEmpty) tails else removeElement(tails, matchingResult),
        result :+ (matchingResult.toList :+ head)
      )
    }
  }

  def removeElement(source:Array[String], target:Array[String]) : Array[String] = {
    if (target.isEmpty) {
      source
    } else {
      removeElement(
        source.filterNot( _== target.head),
        target.tail
      )
    }
  }

  def charMatching(source:String, target:String): Boolean = {

    if (source == target) {
      true
    } else if (source.isEmpty) {
      false
    } else {
      val head = source.head

      if (target.contains(head)) {

        if (source.length == target.length && target.length == 1) {
          true
        } else {
          val index = target.indexOf(head)

          charMatching(
            source.tail,
            target.substring(0, index) + target.substring(index + 1)
          )
        }
      } else false
    }
  }
}
