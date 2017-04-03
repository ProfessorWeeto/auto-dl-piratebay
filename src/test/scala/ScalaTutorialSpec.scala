import ScalaTutorial._
import org.specs2.mutable._

class ScalaTutorialSpec extends Specification {
  val input = "TestMePlease"
    "The output string" should {

      "have the same length as the input string" in {
        "TestMePlease" must have length input.length
      }
      "not be identical to the input string" in {
        "TestMePlease" must not be "Butt"
      }
    }
}