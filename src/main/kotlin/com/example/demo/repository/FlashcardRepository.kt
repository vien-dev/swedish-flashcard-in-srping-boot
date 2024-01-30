package com.example.demo.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

interface FlashcardRepository : MongoRepository<Flashcard, String> {
    @Query("{word:'?0'}")
    fun findFlashcardByWord(word: String): Flashcard

    @Query("{*}")
    fun findAllFlashcards(): List<Flashcard>

    override fun count(): Long
}