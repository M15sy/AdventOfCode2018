package missy.adventofcode2018.cli

import missy.adventofcode2018.solutions.{Part1, SolutionManager}

object Main extends App {
  SolutionManager.allSolutions.foreach(solution => {
    solution match {
      case _: Part1 =>
        println()
        println(s"--- ${solution.name} ---")
        println()
      case _ =>
    }
    println(s"- ${solution.partName} -")
    val start = System.currentTimeMillis()
    println(s"Answer:  ${solution.solve()}")
    val end = System.currentTimeMillis()
    println(s"Elapsed time: ${end - start} ms")
    println()
  })
}
