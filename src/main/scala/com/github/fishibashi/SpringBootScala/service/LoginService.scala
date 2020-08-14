package com.github.fishibashi.SpringBootScala.service

sealed trait LoginError
case object InvalidPassword extends LoginError
case object UserNotFound extends LoginError

trait LoginService {
  class User(val id: String, val isAdmin: Boolean)
  def login(name: String, password: String): Either[LoginError, User]
}