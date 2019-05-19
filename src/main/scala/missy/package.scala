import java.net.URL
import scala.io.Source

package object missy {
  private[missy] def readFileLines(fileUrl: URL): Seq[String] = {
    val bufferedSource = Source.fromURL(fileUrl)
    bufferedSource.getLines.toSeq
  }

  private[missy] def readFileAsString(fileUrl: URL): String = {
    readFileLines(fileUrl).mkString
  }
}
