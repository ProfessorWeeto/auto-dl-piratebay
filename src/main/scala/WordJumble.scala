import scala.util.Random._

object WordJumble {

   /*def main(args:Array[String]): Unit = {
    val input = "Debug"

    println(makeAnagram(input))
  }*/

  def makeAnagram(string: String) : String = { // takes a string, returns a string
    val wordBuffer  = string.toBuffer // we can do more stuff with buffers (like shuffle them for example ;))
    val shuffledBuffer = shuffle(wordBuffer) // fully qualified, this would be val shuffledBuffer = scala.util.Random.shuffle(wordBuffer)

    //If the output is the same as input, run it again
    if(wordBuffer == shuffledBuffer) {
      shuffle(wordBuffer)
    }
    shuffledBuffer.mkString("") // shoves all the data from the buffer into a string, using a blank seperator (if this was " " the word would be spaced like t h i s, if it was "/" it would be like t/h/i/s
  }
  def countUpperCaseChars(string:String) : Int = { // takes a string, returns an integer
    var i = 0 // instantiate the index counter
    var upperChars = 0 // instantiate the number of uppercase characters at 0, as we haven't run it yet so don't have any uppercase characters
    do { // loop through each letter in the string until you reach the end
      if (string.charAt(i).isUpper) { // if the character at (charAt) the current index position is uppercase (isUpper),
        upperChars +=1 // add a count to the number of uppercase characters we have so far
      }
      i+=1 // then, increase the index by 1 to move through to the next letter in the string
    } while (i < string.length)
    upperChars // in other languages, this would be "return upperChars", but scala just takes the last output you've given and presents it as the result of an action
  }
}