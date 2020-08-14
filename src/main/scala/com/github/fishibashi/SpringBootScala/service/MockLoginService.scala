package com.github.fishibashi.SpringBootScala.service

class MockLoginService extends LoginService {
  override def login(name: String, password: String): Either[LoginError, User] = {
    if (name == "ishibashi.futos" && password == "P@s5w0rd") {
      Right(new User(name, true))
    } else if(name == "ishibashi.futos" && password != "P@s5w0rd") {
      Left(InvalidPassword)
    } else {
      Left(UserNotFound)
    }
  }
}