package medium


//https://leetcode.com/problems/permutations/description/
object PerMutation {
  def permute(array: Array[Int]): List[List[Int]] = {
    if (array.length == 1) {
      List(array.toList)
    } else {
      array.indices.flatMap(
        eachIndex => {
          val (element, res) = pop(array, eachIndex)
          val iterator = permute(res)
          iterator.map(
            each => {
              each :+ element
            }
          )
        }
      ).toList
    }
  }

  private def pop(array: Array[Int], index: Int): (Int, Array[Int]) = {
    (array(index), array.take(index) ++ array.drop(index + 1))
  }
}
