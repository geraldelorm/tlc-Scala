package PatternMatching

class Library {

    def borrow(member: Person) = {
        if (member.isMember)
          member.memberShip match {
          case "junior" => 10
          case "regular" => 20
          case "senior citizen" => 30
          case _ => "unknown membership" }

        else println("can't borrow")
    }
}