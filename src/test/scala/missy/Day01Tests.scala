package missy

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{FlatSpecLike, Matchers}

class Day01Tests extends FlatSpecLike with Matchers with TableDrivenPropertyChecks {
  forAll(Table(
    ("testCase", "expected"),
    ("example1", "3"),
    ("example2", "0"),
    ("example3", "-6")
  )) {
    (testCase: String, expected: String) =>
      it should s"return as expected for $testCase" in {
        val testInputFileUrl = getClass.getResource(s"/Day01-$testCase.txt")
        val target = new Day01(testInputFileUrl)
        target.solve() shouldBe expected
      }
  }
}
