/**
  * This is a sample found at http://codereview.stackexchange.com/questions/132552/anagram-in-scala/132556
  */
class Anagram(anagram: String) {
  def matches(candidates: Seq[String]) = {
    candidates.filter(isPermutation)
  }

  def isPermutation(candidate: String) = {
    (candidate.toLowerCase != anagram.toLowerCase) &&
      (candidate.toLowerCase.sortWith(_>_) ==
        anagram.toLowerCase.sortWith(_>_))
  }
}