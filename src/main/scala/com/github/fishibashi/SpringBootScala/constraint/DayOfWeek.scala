package com.github.fishibashi.SpringBootScala.constraint

sealed abstract class DayOfWeek {
  def toE(): String
  def toJ(): String
}
case object Sunday extends DayOfWeek {
  override def toE(): String = "Sunday"
  override def toJ(): String = "日曜日"
}
case object Monday extends DayOfWeek {
  override def toE(): String = "Monday"
  override def toJ(): String = "月曜日"
}
case object Tuesday extends DayOfWeek {
  override def toE(): String = "Tuesday"
  override def toJ(): String = "火曜日"
}
case object Wednesday extends DayOfWeek {
  override def toE(): String = "Wednesday"
  override def toJ(): String = "水曜日"
}
case object Thursday extends DayOfWeek {
  override def toE(): String = "Thursday"
  override def toJ(): String = "木曜日"
}
case object Friday extends DayOfWeek {
  override def toE(): String = "Friday"
  override def toJ(): String = "金曜日"
}
case object Saturday extends DayOfWeek {
  override def toE(): String = "Saturday"
  override def toJ(): String = "土曜日"
}

object DayOfWeek {
  def nextDayOfWeek(d: DayOfWeek): DayOfWeek = d match {
    case Sunday => Monday
    case Monday => Tuesday
    case Tuesday => Wednesday
    case Wednesday => Thursday
    case Thursday => Friday
    case Friday => Saturday
    case Saturday => Sunday
    case _ => null
  }
}