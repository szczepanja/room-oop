import org.scalatest._
import flatspec._
import matchers._

class RoomSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Room"

  val room: Room = Room("Room 123")

  "room.enter" should "return true if given amount of people can enter the room" in {
    room.enter(9) shouldBe true
  }

  it should "return false if people cannot enter the room" in {
    room.enter(11) shouldBe false
  }

}