import scala.util.Random._

object WordJumble {

  /* def debug(args:Array[String]): Unit = {
    val input = "Debug"

    println(makeAnagram(input))
  }*/

  def makeAnagram(string: String) : String = {
    val wordBuffer  = string.toBuffer
    val shuffledBuffer = shuffle(wordBuffer)

    //If the output is the same as input, run it again
    if(wordBuffer == shuffledBuffer) {
      shuffle(wordBuffer)
    }
    shuffledBuffer.mkString("")
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
