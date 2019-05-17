package missy

object Main extends App {
 allSolutions.foreach(s => {
  println(s"--- ${s.name} ---")
  println(s"answer:  ${s.solve()}")
  println()
 })
}
