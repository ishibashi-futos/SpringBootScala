package com.github.fishibashi.SpringBootScala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootScala {}

object SpringBootScala {
  def main(args: Array[String]): Unit = SpringApplication.run(classOf[SpringBootScala], args:_ *)
}
