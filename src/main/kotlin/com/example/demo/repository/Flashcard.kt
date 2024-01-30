package com.example.demo.repository

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document("swedishflashcards")
data class Flashcard (
    val word: String,
    val wordType: String,
    val category: String,
    val extraInfo: List<String>,
    val definition: String,
    val example: String,
    val lastRead: LocalDateTime
)
