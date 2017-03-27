import scala.util.Random._

object ScalaTutorial {

  def main(): Unit = {
    val input = "Michael"

    makeAnagram(input)

  }
  def makeAnagram(string: String): Unit = {
    val wordList  = string.toBuffer
    val shuffledList = shuffle(wordList)

    println(shuffledList.mkString(""))
  }
}