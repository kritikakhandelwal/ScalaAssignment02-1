package edu.knoldus

class Operations {

  def listRotation(num: Int, list: List[Char]): List[Char] = {

    (num, list) match {
      case (0, _) => list
      case (_, Nil) => list
      case (1, head :: tail) => listRotation(0, tail :+ head)
      case (_, head :: tail) => listRotation(num - 1, tail :+ head)
    }
  }

  def eliminateDuplicates(list: List[Char], resultList: List[Char]): List[Char] = {

    list match {
      case head1 :: head2 :: tail if (head1 == head2) => eliminateDuplicates(head1 :: tail, resultList)
      case head1 :: head2 :: tail if (head1 != head2) => eliminateDuplicates(tail, resultList :+ head1)
      case head1 :: Nil => resultList :+ head1
    }
  }

  def isHappy(num: Int, list: List[Int]): Boolean = {

    def checkSum(num: Int, sum: Int): Int = {
      num match {
        case 0 => sum
        case _ => checkSum(num / 10, num % 10 * num % 10)
      }
    }

    def checkList(list: List[Int], n: Int): Boolean = {

      list match {
        case head1 :: tail if (head1 == n) => true
        case head1 :: tail if (head1 != n) => checkList(tail, n)
        case head1 :: nil if (head1 == n) => true
        case head1 :: nil if (head1 != n) => false
        case _ => false
      }
    }

    val number = checkSum(num, 0)
    number match {
      case 1 => true
      case _ => {
        checkList(list, number) match {
          case true => false
          case false => isHappy(num, num :: list)

        }
      }
    }
  }

  def runLength(list:List[Char]):List[(Int,Char)]={
     if(list.isEmpty){Nil}
    else{
       val(charachters,next)=list span{ _== list.head}
       (charachters.length,charachters.head)::runLength(next)
    }
  }
}
