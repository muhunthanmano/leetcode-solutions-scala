package easy

class RomanToInteger {

  val romanDef = Map(
    'I' -> 1,
    'V' -> 5,
    'X' -> 10,
    'L' -> 50,
    'C' -> 100,
    'D' -> 500,
    'M' -> 1000
  )

  def start(roman:String, result:Int = 0): Int = {

    if(roman.length < 2) {

      if(roman.isEmpty) {
         result
      } else {

        result + romanDef(roman.head)
      }

    } else {

      val first = romanDef(roman.head)
      val second = romanDef(roman(1))

      if(first < second) {
        start( roman.drop(2), result + second - first)
      } else {
        start( roman.drop(1), result + first)
      }


    }

  }


  case class romanInfo(total: Int, lastNumber: Int)
  def romanToInt(s: String): Int = {
    s.map(Map(
        'I' -> 1,
        'V' -> 5,
        'X' -> 10,
        'L' -> 50,
        'C' -> 100,
        'D' -> 500,
        'M' -> 1000,
      ))
      .foldLeft(romanInfo(total = 0, lastNumber = 0))((info, nextNumber) => {
        (info.lastNumber >= nextNumber) match {
          case true => romanInfo(
            total = nextNumber + info.total,
            lastNumber = nextNumber
          )
          case false => romanInfo(
            total = nextNumber + info.total - 2 * info.lastNumber,
            lastNumber = nextNumber
          )
        }
      })
      .total
  }

}
