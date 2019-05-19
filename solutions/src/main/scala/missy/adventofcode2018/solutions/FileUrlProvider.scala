package missy.adventofcode2018.solutions

import java.net.URL

private[solutions] trait FileUrlProvider {
  def getUrl(fileName: String): URL
}

private[solutions] trait InputFileUrlProvider extends FileUrlProvider {
  override def getUrl(fileName: String): URL = this.getClass.getResource(s"/$fileName.txt")
}
