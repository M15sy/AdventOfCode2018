package missy

import java.net.URL

class Day01(inputFile: URL = getClass.getResource("/Day01.txt")) extends Solution {
  private val input = readFileLines(inputFile)
  override val name = "Day 1: Chronal Calibration"

  override def solve(): String = {
    input.map(_.toInt).sum.toString
  }
}
