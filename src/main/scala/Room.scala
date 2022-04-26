case class Room(name: String, capacity: Int) {
  if (capacity < 0) throw new IllegalStateException

  var rooms = 0

  def enter(people: People): Boolean = {
    if (people.people <= capacity) {
      rooms += people.people
      true
    }
    else false
  }

  def leave(people: People, room: String): Boolean = {
    if (people.people > capacity) {
      rooms -= people.people
      false
    }
    else true
  }

  def printStatus: String = s"Status of people in room $name: $capacity"

}
