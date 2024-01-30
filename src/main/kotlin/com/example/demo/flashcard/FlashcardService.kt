package com.example.demo.flashcard

import com.example.demo.repository.FlashcardRepository
import com.example.demo.repository.FlashcardSetMetaDataRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FlashcardService(
    @Autowired val flashcardRepo: FlashcardRepository,
    @Autowired val flashcardSetMetaDataRepo: FlashcardSetMetaDataRepository
) {
    fun getFlashcards(): List<FlashCard> {
        return flashcardRepo.findAll().map {
            FlashCard(it)
        }
    }

    fun getFlashcard(word: String): FlashCard {
        return FlashCard(flashcardRepo.findByWord(word))
    }

    fun getMetaData(): List<MetaData> {
        return flashcardSetMetaDataRepo.findAll().map {MetaData(it)}
    }
}