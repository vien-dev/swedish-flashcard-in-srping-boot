package com.example.demo.flashcard

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
class FlashcardController(@Autowired val flashcardService: FlashcardService) {
    @GetMapping("/")
    fun getRoot(): String {
        return "Hello!"
    }

    @GetMapping("/ajax/flashcards")
    fun getFlashcards(): List<FlashCard> {
        return flashcardService.getFlashcards()
    }

    @GetMapping("/ajax/flashcard")
    fun getFlashcard(@RequestParam word: String, @RequestParam(required = false) wordType: Optional<String>): FlashCard {
        println("RequestParam $word")
        return flashcardService.getFlashcard(word)
    }

    @GetMapping("/ajax/flashcard-meta-data")
    fun getMetaData(): List<MetaData> {
        return flashcardService.getMetaData()
    }
}