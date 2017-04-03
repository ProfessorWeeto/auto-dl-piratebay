import org.specs2.mutable._
import ScalaTutorial._

class ScalaTutorialSpec extends Specification {
  val testInput: String = "TestMePlease"
  val testOutput: String = makeAnagram(testInput)

    "The Anagram" should {
      "have the same length as the input string" in {
        testOutput.length must beEqualTo(testInput.length)
      }
      "not be identical to the input string" in {
        testOutput must not be testInput
      }
      "have the same number of uppercase characters" in {
        countUpperCaseChars(testOutput) must beEqualTo(countUpperCaseChars(testInput))
      }
    }
}