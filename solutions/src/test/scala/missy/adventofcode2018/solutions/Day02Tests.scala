package missy.adventofcode2018.solutions

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{FlatSpecLike, Matchers}

class Day02Tests extends FlatSpecLike with Matchers with TableDrivenPropertyChecks {
  behavior of "Day02 part 1"

  it should "return as expected" in {
    val day = new Day02a() with TestInputFileUrlProvider {
      override val exampleName: String = Example.EXAMPLE_1
    }
    day.solve() shouldBe "12"
  }

  behavior of "Day02 part 2"

  it should "return as expected for example1" in {
    var day = new Day02b() with TestInputFileUrlProvider {
      override val exampleName: String = Example.EXAMPLE_1
    }
    day.solve() shouldBe "fgij"
  }

  it should "return as expected for example2" in {
    val day = new Day02b() with TestInputFileUrlProvider {
      override val exampleName: String = Example.EXAMPLE_2
    }
    day.solve() shouldBe "rteotyxzbodglnpkudawhijsc"
  }
}
