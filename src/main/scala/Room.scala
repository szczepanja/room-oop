case class Room(name: String, capacity: Int) {
  if (capacity < 0) throw new IllegalStateException

  var _people = 0

  val people: Person = Person()

  def enter: Boolean = {
    if (capacity - _people >= people.amount) {
      _people += people.amount
      true
    }
    else false
  }

  def leave: Boolean = {
    if (_people >= people.amount) {
      _people -= people.amount
      true
    }
    else false
  }

  def printStatus: String = s"Status of people in room $name: " + _people

}
