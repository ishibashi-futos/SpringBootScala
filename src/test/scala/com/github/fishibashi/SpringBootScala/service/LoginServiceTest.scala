package com.github.fishibashi.SpringBootScala.service

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class LoginServiceTest {
  private val service: LoginService = new MockLoginService()

  @Test
  def loginSuccess(): Unit = {
    val value = service.login("ishibashi.futos", "P@s5w0rd")
    assert(value.isRight)
  }

  @Test
  def invalidPassword(): Unit = {
    service.login("ishibashi.futos", "InvalidPassword") match {
      case Left(InvalidPassword) =>
      case _ => fail("")
    }
  }

  @Test
  def userNotFound(): Unit = {
    service.login("", "InvalidPassword") match {
      case Left(UserNotFound) =>
      case _ => fail("")
    }
  }}
