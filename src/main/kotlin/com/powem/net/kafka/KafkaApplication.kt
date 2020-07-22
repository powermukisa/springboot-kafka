package com.powem.net.kafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
class KafkaApplication

fun main(args: Array<String>) {
//	println("THIS IS WHERE THE APP STARTS")
	runApplication<KafkaApplication>(*args)
//	println("THIS IS WHERE THE APP STARTS 2222222")

}