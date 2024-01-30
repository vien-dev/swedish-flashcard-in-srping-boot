package com.example.demo

import com.example.demo.flashcard.FlashCard
import com.example.demo.flashcard.MetaData
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@EnableMongoRepositories
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
