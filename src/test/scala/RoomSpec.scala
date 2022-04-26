import org.scalatest._
import flatspec._
import matchers._

class RoomSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Room"

  {
    val person = Person()
    val maxCapacity = 5
    val room = Room("kitchen", maxCapacity)

    it should "allow people to enter the room" in {

      room.enter(person) shouldBe true
      room.enter(person) shouldBe true
      room.enter(person) shouldBe true
      room.enter(person) shouldBe true
      room.enter(person) shouldBe true
    }

    it should "disallow people to enter the room if capacity reaches maximum" in {
      room.enter(person) shouldBe false
    }
  }

  it should "allow people to leave the room" in {
  }

  it should "report number of people inside the room" in {
  }

}
