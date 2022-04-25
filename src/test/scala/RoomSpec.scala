import org.scalatest._
import flatspec._
import matchers._

class RoomSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Room"

  val room: Room = Room("123", 10)
  val anotherRoom: Room = Room("321", 0)

  var rooms: Seq[Room] = Seq(room, anotherRoom)

  "room.enter" should "return true if given amount of people can enter the room" in {
    room.enter(People(9)) shouldBe true
  }

  it should "return false if people cannot enter the room" in {
    room.enter(People(11)) shouldBe false
  }

  "room.leave" should "return true if person left the room" in {
    room.leave(People(2), room.name) shouldBe true
  }

  it should "return false when given amount of people is over the capacity" in {
    room.leave(People(11), room.name) shouldBe false
  }

  "room.printStatus" should "report the number of people inside of the room" in {
    room.printStatus shouldBe "Status of people in room 123: 10"
    anotherRoom.printStatus shouldBe "Status of people in room 321: 0"
  }

  "rooms" should "return all rooms available" in {
    rooms shouldBe Seq(Room("123", 10), Room("321", 0))
  }

}
