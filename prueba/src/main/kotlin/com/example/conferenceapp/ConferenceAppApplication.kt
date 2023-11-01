package com.example.conferenceapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConferenceAppApplication

fun main(args: Array<String>) {
	runApplication<ConferenceAppApplication>(*args)
}
