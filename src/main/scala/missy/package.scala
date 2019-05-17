import java.net.URL

import scala.io.Source

package object missy {
  val allSolutions: Seq[Solution] = Seq(
    new Day01a(),
    //    new Day01b(),
    //    new Day02a(),
    //    new Day02b(),
  )

  private[missy] def readFileLines(fileUrl: URL): Seq[String] = {
    val bufferedSource = Source.fromURL(fileUrl)
    val lines = bufferedSource.getLines.toSeq
    lines
  }

  private[missy] def readFileAsString(fileUrl: URL): String = {
    readFileLines(fileUrl).mkString
  }
}
