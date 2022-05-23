package easy



class ListNode(_x: Int = 0, _next: ListNode = null) {

    var next: ListNode = _next
    var x: Int = _x
}

class MergeTwoSortedList {


  val list1 = Seq(
    1,3,5,6,7,8
  ).reverse

  val list2 = Seq(
    1,2,7,10,12
  ).reverse

  def convertListToLinkedList(list: Seq[Int], result:ListNode = null): ListNode = {

    if(list.nonEmpty) {

      convertListToLinkedList(list.tail,new ListNode(list.head, result))

    } else result
  }


  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
    merge(list1, list2, null)
  }

  def merge(list1: ListNode, list2: ListNode, outPut: ListNode) : ListNode = {

    if(list1 != null && list2 != null) {

      if(list1.x >= list2.x) {
          merge(
            list1,  list2.next, new ListNode(list2.x, outPut)
          )
      } else {
        merge(
          list1.next,  list2, new ListNode(list1.x, outPut)
        )
      }


    } else if(list1 != null) {
      merge(
        list1.next,  list2, new ListNode(list1.x, outPut)
      )
    } else if (list2 != null) {
      merge(
        list1,  list2.next, new ListNode(list2.x, outPut)
      )
    } else outPut

  }

  def printLinkedList(list: ListNode): Unit = {

    println("the list element is : " + list.x)

    if(list.next != null) {
      printLinkedList(list.next)
    }

  }





  def reverseLinkedList (list: ListNode, out:ListNode): ListNode = {

    if(list!=null) {
      reverseLinkedList(
        list.next, new ListNode(list.x, out)
      )
    } else out


  }

}
