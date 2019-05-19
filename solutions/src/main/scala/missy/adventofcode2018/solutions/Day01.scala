package missy.adventofcode2018.solutions

import scala.collection.mutable.ListBuffer

private abstract class Day01 extends Solution {
  this: FileUrlProvider =>
  override val name = "Day 1: Chronal Calibration"
  private lazy val inputFileUrl = getUrl("Day01")
  protected lazy val input: Seq[Int] = readFileLines(inputFileUrl).map(_.toInt)
}

private[solutions] class Day01a extends Day01 with Part1 {
  this: FileUrlProvider =>
  override def solve(): String = input.sum.toString
}

private[solutions] class Day01b extends Day01 with Part2 {
  this: FileUrlProvider =>
  override def solve(): String = {
    // TODO this is slow
    val frequencies = new ListBuffer[Int]()
    var currentFrequency = 0
    frequencies += currentFrequency
    var continue = true
    while (continue) {
      for (change <- input if continue) {
        currentFrequency += change
        if (frequencies.contains(currentFrequency)) {
          continue = false
        } else {
          frequencies += currentFrequency
        }
      }
    }
    currentFrequency.toString
  }
}
