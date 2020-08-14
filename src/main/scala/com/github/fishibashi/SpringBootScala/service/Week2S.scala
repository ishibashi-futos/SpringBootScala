package com.github.fishibashi.SpringBootScala.service

import com.github.fishibashi.SpringBootScala.constraint.{DayOfWeek, English, Japanese, Languages}

class Week2S {
  def dayOfWeek2S(dow: DayOfWeek, lang: Languages): String = lang match {
    case Japanese => dow.toJ()
    case English => dow.toE()
    case _ => ""
  }
}
