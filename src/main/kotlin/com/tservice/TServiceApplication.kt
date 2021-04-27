package com.tservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TServiceApplication

fun main(args: Array<String>) {
	runApplication<TServiceApplication>(*args)
}
