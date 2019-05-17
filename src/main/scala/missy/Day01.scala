package missy

import java.net.URL
import scala.collection.mutable.ListBuffer

abstract class Day01(inputFile: Option[URL]) extends Solution {
  private val inputFileUrl = inputFile.getOrElse(getClass.getResource("/Day01.txt"))
  protected lazy val input: Seq[Int] = readFileLines(inputFileUrl).map(_.toInt)
  override val name = "Day 1: Chronal Calibration"
}

class Day01a(inputFile: Option[URL] = None) extends Day01(inputFile) with Part1 {
  override def solve(): String = input.sum.toString
}

class Day01b(inputFile: Option[URL] = None) extends Day01(inputFile) with Part2 {
  override def solve(): String = {
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
