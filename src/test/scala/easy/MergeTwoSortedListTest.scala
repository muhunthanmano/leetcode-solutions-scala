package easy

import org.scalatest.funsuite.AnyFunSuite

class MergeTwoSortedListTest extends AnyFunSuite {

  val mergeTwoSortedList = new MergeTwoSortedList

  test("it should give expected results") {

    val result = mergeTwoSortedList.mergeTwoLists(
      mergeTwoSortedList.convertListToLinkedList(mergeTwoSortedList.list1),
      mergeTwoSortedList.convertListToLinkedList(mergeTwoSortedList.list2)
    )

    assert(

        linkedListToList(result, Seq.empty) === Seq(1, 1, 2, 3, 5, 6, 7, 7, 8, 10, 12)

    )
  }

  test("it should give first output") {

    val result = mergeTwoSortedList.mergeTwoLists(
      mergeTwoSortedList.convertListToLinkedList(Seq(1,2,4,5).reverse),
      mergeTwoSortedList.convertListToLinkedList(Seq().empty)
    )

    assert(
      linkedListToList(result, Seq.empty) === Seq(1,2,4,5)
    )
  }



  def linkedListToList(linkedList: ListNode, list:Seq[Int] ): Seq[Int] = {

    if(linkedList != null) {
      linkedListToList(
        linkedList.next,
        list :+ linkedList.x
      )
    } else list.reverse

  }

}
