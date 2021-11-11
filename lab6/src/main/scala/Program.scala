import java.io.File

object Program extends App {
  val listOfFiles = (new File(".")).listFiles

  println("### List of everything")
  listOfFiles.foreach(s => println(s))

  println(" ")
  println("### Not hidden Files")
  val notHidden = listOfFiles.filter(a => !a.getName.startsWith(".")).toList
  println(notHidden)

  println(" ")
  println("### List of directories and list of files")
  val listOfDirectories = notHidden.filter( _.isDirectory)
  println("Directories: ",listOfDirectories)

  val listOfFilesHere = notHidden.filter(_.isFile)
  println("Files: ", listOfFilesHere)

  println(" ")
  println("### Pair of Name and file size")
  val pairs = listOfFiles.map(a => (a.getName -> a.length)).toList
  println(pairs)

  println(" ")
  println("### List of the 10 smallest files")
  val listOfSmallest = listOfFiles.sortBy(a => a.length()).toList
  println(listOfSmallest)

  println(" ")
  println("### Map of key: name and value: size")
  val pairMap = listOfFiles.map(a => Map(a.getName -> a.length())).toList
  println(pairMap)

  println("Q6")
  println("### Data Structure that arranges content o the directory according to the first letter of their name")
//  val grouped = listOfFiles.groupBy(a => a.getName.charAt(0))
  val grouped = listOfFiles.toList.groupBy(file => file.getName.charAt(0))
  println(grouped)

}
