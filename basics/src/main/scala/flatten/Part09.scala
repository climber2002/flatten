package flatten

trait Part09 {

  // Most well-known typeclasses in Play are the ones for JSON: Reads, Writes and Format
  // Play provides some `instances` of them: Format[String], Reads[DateTime], etc.
  // You can define `instances` of these type classes for your own classes.

  // Exercise: without looking at the previous part, create a type class `Serializable`, a function `toBytes` that impicitly uses this
  // typeclass, and instances for `Int` and `String`.

  trait Serializable[A] {

    def toBytes(a: A): Array[Byte]

  }

  val intSerializable = new Serializable[Int] {
    def toBytes(i: Int): Array[Byte] = i.toString.getBytes
  }

  val stringSerializable = new Serializable[String] {
    def toBytes(s: String): Array[Byte] = s.getBytes
  }
}