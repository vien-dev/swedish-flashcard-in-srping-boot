package com.example.demo.flashcard

import com.example.demo.repository.Flashcard

data class FlashCard(
        var word: String,
        var wordType: String,
        var category: String,
        var extraInfo: MutableList<String>,
        var definition: String,
        var example: String,
) {
    constructor(dbFlashcard: Flashcard?) : this(
            word = dbFlashcard?.word?:"",
            wordType = dbFlashcard?.wordType?:"",
            category = dbFlashcard?.category?:"",
            extraInfo = dbFlashcard?.extraInfo?.toMutableList()?: mutableListOf(),
            definition = dbFlashcard?.definition?:"",
            example = dbFlashcard?.example?:""
    )
}
