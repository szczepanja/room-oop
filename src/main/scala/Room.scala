case class People(people: Int)

case class Room(name: String, capacity: Int) {

  var rooms = 0

  def enter(people: People): Boolean = {
    if (people.people <= capacity) {
      rooms += people.people
      true
    }
    else false
  }

  def leave(people: People, room: Room): Boolean = {
    if (people.people > capacity) {
      rooms -= people.people
      false
    }
    else true
  }

  def printStatus: String = s"Status of people in room $name: $capacity"

}

object Main extends App {
  val room1 = Room("1", 5)
  val room2 = Room("10", 10)
}
