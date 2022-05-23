import easy.{MergeTwoSortedList, RomanToInteger}
import medium.LongestPalindrome

object Bootstrap {

  def main(args: Array[String]): Unit = {

//    println(
//      new LongestPalindrome start("esbtzjaaijqkgmtaajpsdfiqtvxsgfvijpxrvxgfumsuprzlyvhclgkhccmcnquukivlpnjlfteljvykbddtrpmxzcrdqinsnlsteonhcegtkoszzonkwjevlasgjlcquzuhdmmkhfniozhuphcfkeobturbuoefhmtgcvhlsezvkpgfebbdbhiuwdcftenihseorykdguoqotqyscwymtjejpdzqepjkadtftzwebxwyuqwyeegwxhroaaymusddwnjkvsvrwwsmolmidoybsotaqufhepinkkxicvzrgbgsarmizugbvtzfxghkhthzpuetufqvigmyhmlsgfaaqmmlblxbqxpluhaawqkdluwfirfngbhdkjjyfsxglsnakskcbsyafqpwmwmoxjwlhjduayqyzmpkmrjhbqyhongfdxmuwaqgjkcpatgbrqdllbzodnrifvhcfvgbixbwywanivsdjnbrgskyifgvksadvgzzzuogzcukskjxbohofdimkmyqypyuexypwnjlrfpbtkqyngvxjcwvngmilgwbpcsseoywetatfjijsbcekaixvqreelnlmdonknmxerjjhvmqiztsgjkijjtcyetuygqgsikxctvpxrqtuhxreidhwcklkkjayvqdzqqapgdqaapefzjfngdvjsiiivnkfimqkkucltgavwlakcfyhnpgmqxgfyjziliyqhugphhjtlllgtlcsibfdktzhcfuallqlonbsgyyvvyarvaxmchtyrtkgekkmhejwvsuumhcfcyncgeqtltfmhtlsfswaqpmwpjwgvksvazhwyrzwhyjjdbphhjcmurdcgtbvpkhbkpirhysrpcrntetacyfvgjivhaxgpqhbjahruuejdmaghoaquhiafjqaionbrjbjksxaezosxqmncejjptcksnoq")
//    )

//    if(args.length <= 1) {
//       throw new Exception ("You must pass the problem name")
//    } else {
//      args.head match {
//        case "palindrome" => {
//
//          val palindrome = new LongestPalindrome start(args(1))
//          println("The biggest palindrome is : " + palindrome)
//
//        }
//        case _  => throw new Exception("The problem name didn't match")
//      }
//    }


//   println(
//
//     "MCMXCIV".map(Map(
//       'I' -> 1,
//       'V' -> 5,
//       'X' -> 10,
//       'L' -> 50,
//       'C' -> 100,
//       'D' -> 500,
//       'M' -> 1000,
//     ))
//
//   )

//    println(new RomanToInteger start("MCMXCIV"))



    val mergeTwoSortedList = new MergeTwoSortedList

    val result = mergeTwoSortedList.mergeTwoLists(
      mergeTwoSortedList.convertListToLinkedList(mergeTwoSortedList.list1),
      mergeTwoSortedList.convertListToLinkedList(mergeTwoSortedList.list2)

    )

    println(mergeTwoSortedList.printLinkedList(mergeTwoSortedList.reverseLinkedList(result, null)))



  }
}
