package missy.adventofcode2018

import java.net.URL
import scala.io.Source

package object solutions {
  private[solutions] def readFileLines(fileUrl: URL): Seq[String] = {
    val bufferedSource = Source.fromURL(fileUrl)
    bufferedSource.getLines.toSeq
  }

  private[solutions] def readFileAsString(fileUrl: URL): String = {
    readFileLines(fileUrl).mkString
  }
}
