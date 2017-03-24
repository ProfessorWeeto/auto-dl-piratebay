object ScalaTutorial {

  def main(args:Array[String]): Unit = {
    var i = 0   //index for the loop
    val letters = "Anagram"
    val arrayLength = letters.length
    val wordArray = new Array[String](arrayLength + 1)
    val word = new StringBuilder(arrayLength + 1)

    do {
      // for each loop round, generate a new random number between 0 and the length of the word, then round it to the nearest integer

      val randomNumber = (Math.random() * arrayLength).toInt
      // for each loop round, grab the letter at the index of i (in the string) and put it into the array at the same index
      wordArray(i) = letters(randomNumber).toString
      // using the StringBuilder object, append the letter stored in the array at index i to the word string
      word.append(wordArray(i))
      // TODO: remove an item from the array
      removeItem(wordArray, i)
      i+=1 // increment the index on the loop
    } while (i < arrayLength)

  }

  def removeItem(array: Array[String], index: Int): Array[String] = {
    val buffer = array.toBuffer
    buffer.remove(index)
    println(buffer)
    buffer.toArray
  }
}