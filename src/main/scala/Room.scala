case class Room(name: String, capacity: Int) {
  if (capacity < 0) throw new IllegalStateException

  var rooms = 0

  val people: Person = Person()

  def enter: Boolean = {
    if (capacity - rooms >= people.amount) {
      rooms += people.amount
      true
    }
    else false
  }

  def leave: Boolean = {
    if (rooms >= people.amount) {
      rooms -= people.amount
      true
    }
    else false
  }

  def printStatus: String = s"Status of people in room $name: $capacity"

}
