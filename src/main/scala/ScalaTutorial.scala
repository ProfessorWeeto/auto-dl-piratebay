import scala.util.Random._

object ScalaTutorial {

  def main(args:Array[String]): Unit = {
    val input = "Michael"

    makeAnagram(input)
  }

  def makeAnagram(string: String): Unit = {
    val wordList  = string.toBuffer
    val shuffledList = shuffle(wordList)

    shuffledList.mkString("")
  }
}