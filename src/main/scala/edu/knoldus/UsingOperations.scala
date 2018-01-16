package edu.knoldus

object UsingOperations extends App {
  val log = Logger.getLogger(this.getClass)

  val obj = new Operations
  val num = 3
  val list1 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
  val list2 = List('b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e', 'a', 'a', 'a', 'a')
  val magicNum = 19
  val resultList: List[Char] = List()

  val listAfterRotation = println("list After Rotation" + obj.listRotation(num, list1))
  val listAfterElimination = println("list After Rotation" + obj.eliminateDuplicates(list2, resultList))
  val isHappySad = obj.isHappy(magicNum, List())
  if (isHappySad) {
    println(s"$magicNum" + " " + " is Happy Number")
  }
  else
    println(s"$magicNum" + " " + "is Sad Number")

  val listOfList = obj.runLength(list2)
  println("solution of run length encoding" + listOfList)

}
