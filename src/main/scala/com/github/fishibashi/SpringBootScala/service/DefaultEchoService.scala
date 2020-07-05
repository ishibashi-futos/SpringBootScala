package com.github.fishibashi.SpringBootScala.service

import org.springframework.stereotype.Component

@Component
class DefaultEchoService extends EchoService {
  @Override
  def echo(message: String): String = message + "\n\n"

  @Override
  override def replace(message: String, subStr: String, newSubStr: String): String = super.replace(message, subStr, newSubStr) + "\n"
}
