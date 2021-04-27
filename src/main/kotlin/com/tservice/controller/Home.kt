package com.tservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.HttpServerErrorException
import java.lang.RuntimeException
import java.rmi.ServerException

@RestController
class Home {

  @GetMapping("/")
  fun home(): String{
    val randomNumber = (Math.random()*10).toInt()
    if((randomNumber % 2) == 0)
      return "Hello World";
    throw RuntimeException("Error Occurred")
  }

  @GetMapping("/success")
  fun success(): String{
      return "Success";
  }

  @GetMapping("/fail")
  fun fail(): String{
    throw ServerException("Some Error Occurred")
  }

}