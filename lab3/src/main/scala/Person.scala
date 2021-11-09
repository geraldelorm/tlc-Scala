import java.time.LocalDate

class Person (val first: String, val last: String, val dob: LocalDate) {

  def age = java.time.Period.between(dob, java.time.LocalDate.now()).getYears
}

//object Person{
//  def apply(f: String, l: String) = new Person(f, l)
//}
