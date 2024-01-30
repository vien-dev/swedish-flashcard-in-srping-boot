package com.example.demo.flashcard

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FlashcardController(@Autowired val flashcardService: FlashcardService) {
    @GetMapping("/ajax/flashcards")
    fun getFlashcards(): List<FlashCard> {
        return flashcardService.getFlashcards()
    }

    @GetMapping("/ajax/flashcard")
    fun getFlashcard(): FlashCard {
        return flashcardService.getFlashcard("hello")
    }

    @GetMapping("/ajax/flashcard-meta-data")
    fun getMetaData(): MetaData {
        return flashcardService.getMetaData()
    }
}