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
      "Day01 part 1" should s"return as expected for $testCase" in {
        val testInputFileUrl = getClass.getResource(s"/Day01/part1/$testCase.txt")
        val target = new Day01a(Some(testInputFileUrl))
        target.solve() shouldBe expected
      }
  }

  forAll(Table(
    ("testCase", "expected"),
    ("example1", "0"),
    ("example2", "10"),
    ("example3", "5"),
    ("example4", "14")
  )) {
    (testCase: String, expected: String) =>
      "Day01 part 2" should s"return as expected for $testCase" in {
        val testInputFileUrl = getClass.getResource(s"/Day01/part2/$testCase.txt")
        val target = new Day01b(Some(testInputFileUrl))
        target.solve() shouldBe expected
      }
  }
}
