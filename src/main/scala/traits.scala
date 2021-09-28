object Traits {
  def main(args: Array[String]): Unit = {

    val batman = new Hero("Batman")
    println(batman.fly)
    println(batman.hitByBullet)
    println(batman.ricochet(2500))
  }

  trait Flyable {
    def fly: String
  }

  trait BulletProof {
    def hitByBullet: String

    def ricochet(startSpeed: Double): String = {
      "The bullet ricochets at a speed of %.1f ft/sec".format(startSpeed * .75)
    }
  }

  class Hero(val name: String) extends Flyable with BulletProof {
    def fly = "%s flies through the air".format(this.name)

    def hitByBullet: String = "The bullet bounces off of %s".format(this.name)
  }
}