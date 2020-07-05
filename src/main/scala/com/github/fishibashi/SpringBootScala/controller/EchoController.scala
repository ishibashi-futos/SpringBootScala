package com.github.fishibashi.SpringBootScala.controller

import com.github.fishibashi.SpringBootScala.fw.validator.Length
import com.github.fishibashi.SpringBootScala.service.EchoService
import javax.validation.constraints.{NotBlank, NotNull, Size}
import javax.validation.Valid
import org.springframework.lang.NonNull
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RequestParam, RestController}

@RestController
@RequestMapping(Array("/echo"))
@Validated
class EchoController(val service: EchoService) {
  @RequestMapping(method = Array(RequestMethod.GET))
  def echo(@RequestParam("message") message: String): String = service.echo(message)

  @RequestMapping(path = Array("replace"), method = Array(RequestMethod.GET))
  def replace(@Valid @RequestParam("message") @NotNull @NotBlank message: String,
              @Valid @RequestParam("substr") @NonNull @Length(max = 1, min = 1) subStr: String,
              @Valid @RequestParam("newsubstr") @NonNull @Length(max = 1, min = 1) newSubStr: String): String = service.replace(message, subStr, newSubStr)
}
