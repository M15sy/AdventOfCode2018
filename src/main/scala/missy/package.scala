import java.net.URL

import scala.io.Source

package object missy {

  val allSolutions: Seq[Solution] = Seq(
    new Day01()
  )

  def readFileLines(fileUrl: URL): Seq[String] = {
    val bufferedSource = Source.fromURL(fileUrl)
    val lines = bufferedSource.getLines.toSeq
    lines
  }

  def readFileAsString(fileUrl: URL): String = {
    readFileLines(fileUrl).mkString
  }
}
