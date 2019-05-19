package missy.adventofcode2018.solutions

object SolutionManager {
  val allSolutions: Seq[Solution] = Seq(
    new Day01a() with InputFileUrlProvider,
    new Day01b() with InputFileUrlProvider,
    new Day02a() with InputFileUrlProvider,
    new Day02b() with InputFileUrlProvider
  )
}
