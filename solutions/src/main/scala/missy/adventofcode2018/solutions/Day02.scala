package missy.adventofcode2018.solutions

private abstract class Day02 extends Solution {
  this: FileUrlProvider =>
  override val name = "Day 2: Inventory Management System"
  private lazy val inputFileUrl = getUrl("Day02")
  protected lazy val input: Seq[String] = readFileLines(inputFileUrl)
}

private[solutions] class Day02a extends Day02 with Part1 {
  this: FileUrlProvider =>
  override def solve(): String = {
    input
      .map(_.toCharArray)
      .map(_.groupBy(identity).mapValues(_.length))
      .flatMap(it => it.find(_._2 == 2) ++ it.find(_._2 == 3))
      .groupBy(_._2)
      .map(_._2.length)
      .product
      .toString
  }
}

private[solutions] class Day02b extends Day02 with Part2 {
  this: FileUrlProvider =>
  override def solve(): String = {
    ""
  }
}
