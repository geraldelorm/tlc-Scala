object HelloWorld {
  def main(args: Array[String]): Unit = {
    //lab1 Q1
    println("Hello World")

    //lab2 Q1
    println(temperatureConvertor(10))

    //lab2 Q2
    stringToDate("01/02/15")
    stringToDate("02/12/20")
    stringToDate("14/06/19")

    //lab2 Q3
    extractData("root:x:0:0:root:/root:/bin/bash")
    extractData("bin:x:1:1:bin:/bin:/sbin/nologin")
    extractData("daemon:x:2:2:daemon:/sbin:/sbin/nologin")
    extractData("adm:x:3:4:adm:/var/adm:/sbin/nologin")
    extractData("lp:x:4:7:lp:/var/spool/lpd:/sbin/nologin")
    extractData("sync:x:5:0:sync:/sbin:/bin/sync")
  }


  def temperatureConvertor(c: Int)={
    (c * 9 / 5) + 32
  }


  def stringToDate(date: String) = {
    val capture = raw"(.*)/(.*)/(.*)".r
    val capture(day, mouth, year) = date

    day match {
      case i if (i == "01" || i == "21" || i == "31") => print(i.toInt+"st ")
      case i if (i == "02" || i == "22") => print(i.toInt+"nd ")
      case i if (i == "03" || i == "23") => print(i.toInt+"rd ")
      case i => print(i.toInt + "th ")
    }

    mouth match {
      case "01" => print("January ")
      case "02" => print("February ")
      case "03" => print("March ")
      case "04" => print("April ")
      case "05" => print("May ")
      case "06" => print("June ")
      case "07" => print("July ")
      case "08" => print("August ")
      case "09" => print("September ")
      case "10" => print("October ")
      case "11" => print("November ")
      case "12" => print("December ")
    }
    year match {
      case i => println("20" + i)
    }
  }


  def extractData(line: String) = {
    val capture = raw"(.*):(.*):(.*):(.*):(.*):(.*):(.*)".r
    val capture(username, password, userid, groupid, description, home_directory, shell) = line

    println(s"username: $username" )
    println(s"password: $password" )
    println(s"userid: $userid" )
    println(s"groupid: $groupid" )
    println(s"description: $description" )
    println(s"home director: $home_directory" )
    println(s"shell: $shell" )
  }
}
