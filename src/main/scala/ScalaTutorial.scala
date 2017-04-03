import scala.util.Random._

object ScalaTutorial {

  /* def main(args:Array[String]): Unit = {
    val input = "Debug"

    println(makeAnagram(input))
  }*/

  def makeAnagram(string: String) : String = {
    val wordList  = string.toBuffer
    val shuffledList = shuffle(wordList)

    shuffledList.mkString("")
  }
  def countUpperCaseChars(string:String) : Int = {
    var i = 0
    var upperChars = 0
    do {
      if (string.charAt(i).isUpper) {
        upperChars +=1
      }
      i+=1
    } while (i < string.length)
    upperChars
  }
}