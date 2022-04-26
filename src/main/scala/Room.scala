case class Room(name: String, capacity: Int) {
  if (capacity < 0) throw new IllegalStateException

  var rooms = 0

  def enter(people: Person): Boolean = {
    if (capacity - rooms >= people.amount) {
      rooms += people.amount
      true
    }
    else false
  }

  def leave(people: Person, room: String): Boolean = {
    if (people.amount > capacity) {
      rooms -= people.amount
      false
    }
    else true
  }

  def printStatus: String = s"Status of people in room $name: $capacity"

}
