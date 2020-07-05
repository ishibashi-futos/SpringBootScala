package com.github.fishibashi.SpringBootScala.service

trait EchoService {
  def echo(message: String): String
  def replace(message: String, subStr: String, newSubStr: String): String = message.split("").map(s => if (s == subStr) newSubStr else s).mkString
}
