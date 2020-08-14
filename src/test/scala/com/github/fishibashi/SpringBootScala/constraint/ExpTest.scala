package com.github.fishibashi.SpringBootScala.constraint

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class ExpTest {
  @Test
  def example(): Unit = {
    val example = Add(Lit(1), Div(Mul(Lit(2), Lit(3)), Lit(2)))
    assertEquals(Evaluator.eval(example), 4)
  }
}
