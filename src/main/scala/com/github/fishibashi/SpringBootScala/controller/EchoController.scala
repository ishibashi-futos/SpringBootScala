package com.github.fishibashi.SpringBootScala.controller

import com.github.fishibashi.SpringBootScala.fw.validator.Length
import com.github.fishibashi.SpringBootScala.service.EchoService
import javax.validation.constraints.{Min, NotBlank, NotNull}
import javax.validation.Valid
import org.slf4j.{Logger, LoggerFactory}
import org.springframework.lang.NonNull
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RequestParam, RestController}

@RestController
@RequestMapping(Array("/echo"))
@Validated
class EchoController(val service: EchoService) {
  val logger: Logger = LoggerFactory.getLogger(classOf[EchoController])
  @RequestMapping(method = Array(RequestMethod.GET))
  def echo(@RequestParam("message") message: String): String = service.echo(message)

  @RequestMapping(path = Array("replace"), method = Array(RequestMethod.GET))
  def replace(@Valid @RequestParam("message") @NotNull @NotBlank message: String,
              @Valid @RequestParam("substr") @NonNull @Length(max = 1, min = 1) subStr: String,
              @Valid @RequestParam("newsubstr") @NonNull @Length(max = 1, min = 1) newSubStr: String): String = service.replace(message, subStr, newSubStr)

  @RequestMapping(method = Array(RequestMethod.GET), path = Array("distance"))
  def distance(@Valid @RequestParam("message") @NotBlank message: String,
               @Valid @RequestParam("count") @Min(1) count: Int): String = {
    logger.info(s"message=$message, count=$count")
    logger.info("distance=" + "_".repeat(count) + ".")
    for (i <- 1 to count) {
      logger.info(service.distance(message)(i))
    }
    service.distance(message)(count)
  }
}
