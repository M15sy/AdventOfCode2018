package missy

import java.net.URL

private[missy] trait FileUrlProvider {
  def getUrl(fileName: String): URL
}

private[missy] trait InputFileUrlProvider extends FileUrlProvider {
  override def getUrl(fileName: String): URL = this.getClass.getResource(s"/$fileName.txt")
}
