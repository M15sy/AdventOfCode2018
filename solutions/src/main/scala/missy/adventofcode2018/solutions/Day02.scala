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
    var id: Option[String] = None
    for (a <- input; b <- input) {
      val zipA = a.zipWithIndex
      val diff = zipA.diff(b.zipWithIndex)
      if (diff.length == 1) {
        id = Some(zipA.filterNot(diff.contains(_)).map(_._1).mkString)
      }
    }
    id.get
  }
}
