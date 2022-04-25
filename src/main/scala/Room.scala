case class Room(name: String, capacity: Int = 10) {

  var rooms = 0

  def enter(people: Int): Boolean = {
    if (capacity + people >= rooms && people <= capacity) {
      rooms += people
      true
    }
    else false
  }

  def leave(people: Int, roomName: String): Boolean = {
    true
  }

}