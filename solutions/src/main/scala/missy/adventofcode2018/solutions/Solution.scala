package missy.adventofcode2018.solutions

trait Solution extends Part {
  val name: String

  def solve(): String
}

trait Part {
  val partName: String
}

trait Part1 extends Part {
  override final val partName: String = "Part 1"
}

trait Part2 extends Part {
  override final val partName: String = "Part 2"
}
