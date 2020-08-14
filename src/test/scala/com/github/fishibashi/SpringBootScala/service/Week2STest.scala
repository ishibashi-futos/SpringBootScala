package com.github.fishibashi.SpringBootScala.service

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import com.github.fishibashi.SpringBootScala.constraint.{DayOfWeek, English, Japanese,
  Sunday,
  Monday,
  Tuesday,
  Wednesday,
  Thursday,
  Friday,
  Saturday
}

class Week2STest {
  val target = new Week2S()
  private val toE = (x: DayOfWeek) => target.dayOfWeek2S(x, English)
  private val toJ = (x: DayOfWeek) => target.dayOfWeek2S(x, Japanese)

  @Test
  def dowToStringToE(): Unit = {
    assertEquals(toE(Sunday), "Sunday")
    assertEquals(toE(Monday), "Monday")
    assertEquals(toE(Tuesday), "Tuesday")
    assertEquals(toE(Wednesday), "Wednesday")
    assertEquals(toE(Thursday), "Thursday")
    assertEquals(toE(Friday), "Friday")
    assertEquals(toE(Saturday), "Saturday")
  }

  @Test
  def dowToStringToJ(): Unit = {
    assertEquals(toJ(Sunday), "日曜日")
    assertEquals(toJ(Monday), "月曜日")
    assertEquals(toJ(Tuesday), "火曜日")
    assertEquals(toJ(Wednesday), "水曜日")
    assertEquals(toJ(Thursday), "木曜日")
    assertEquals(toJ(Friday), "金曜日")
    assertEquals(toJ(Saturday), "土曜日")
  }
}