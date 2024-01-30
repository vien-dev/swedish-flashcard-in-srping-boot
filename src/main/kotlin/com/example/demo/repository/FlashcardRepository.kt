package com.example.demo.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface FlashcardRepository : MongoRepository<Flashcard, String> {
    @Query("{'word': ?0}")
    fun findByWord(word: String): Flashcard?

    override fun findAll(): List<Flashcard>

    override fun count(): Long
}