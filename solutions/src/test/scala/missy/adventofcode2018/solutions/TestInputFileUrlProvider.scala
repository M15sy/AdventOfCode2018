package missy.adventofcode2018.solutions

import java.net.URL

private[solutions] trait TestInputFileUrlProvider extends FileUrlProvider {
  this: Part =>
  val exampleName: String
  override def getUrl(fileName: String): URL = {
    val name = s"/$fileName/$partName/$exampleName/$fileName.txt"
    getClass.getResource(name)
  }
}
