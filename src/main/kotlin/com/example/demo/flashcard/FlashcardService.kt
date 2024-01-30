package com.example.demo.flashcard

import com.example.demo.repository.FlashcardRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping

@Service
class FlashcardService(@Autowired val flashcardRepo: FlashcardRepository) {
    fun getFlashcards(): List<FlashCard> {
        return flashcardRepo.findAllFlashcards().map {
            FlashCard(it)
        }
    }

    fun getFlashcard(word: String): FlashCard {
        return FlashCard(flashcardRepo.findFlashcardByWord("hello"))
    }

    fun getMetaData(): MetaData {
        return MetaData(
                mutableListOf("beginner"),
                mutableListOf("n", "v")
        )
    }
}