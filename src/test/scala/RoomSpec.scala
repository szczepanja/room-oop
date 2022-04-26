import org.scalatest._
import flatspec._
import matchers._

class RoomSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Room"

  {
    val maxCapacity = 5
    val room = Room("kitchen", maxCapacity)

    it should "allow people to enter" in {
      room.enter shouldBe true
      room.enter shouldBe true
      room.enter shouldBe true
      room.enter shouldBe true
      room.enter shouldBe true
    }

    it should "disallow people to enter if capacity reaches maximum" in {
      room.enter shouldBe false
    }

    it should "allow people to leave" in {
      room.leave shouldBe true
      room.leave shouldBe true
      room.leave shouldBe true
    }

    it should "report number of people inside" in {
      val peopleInside = 2
      room.printStatus shouldBe s"Status of people in room kitchen: $peopleInside"
    }
  }

  {
    it should "allow two person to enter, one person to leave and return number of people" in {
      val maxCapacity = 3
      val room = Room("dinning-room", maxCapacity)

      room.enter shouldBe true
      room.enter shouldBe true
      room.leave shouldBe true
      room._people shouldBe 1

    }
  }

}
