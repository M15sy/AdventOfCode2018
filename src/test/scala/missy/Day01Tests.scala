package missy

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{FlatSpecLike, Matchers}

class Day01Tests extends FlatSpecLike with Matchers with TableDrivenPropertyChecks {
  behavior of "Day01 part 1"

  forAll(Table(
    ("testCase", "expected"),
    (Example.EXAMPLE_1, "3"),
    (Example.EXAMPLE_2, "0"),
    (Example.EXAMPLE_3, "-6")
  )) {
    (testCase: String, expected: String) =>
      it should s"return as expected for $testCase" in {
        val day = new Day01a() with TestInputFileUrlProvider {
          override val exampleName: String = testCase
        }
        day.solve() shouldBe expected
      }
  }

  behavior of "Day01 part 2"

  forAll(Table(
    ("testCase", "expected"),
    (Example.EXAMPLE_1, "0"),
    (Example.EXAMPLE_2, "10"),
    (Example.EXAMPLE_3, "5"),
    (Example.EXAMPLE_4, "14")
  )) {
    (testCase: String, expected: String) =>
      it should s"return as expected for $testCase" in {
        val day = new Day01b() with TestInputFileUrlProvider {
          override val exampleName: String = testCase
        }
        day.solve() shouldBe expected
      }
  }
}
