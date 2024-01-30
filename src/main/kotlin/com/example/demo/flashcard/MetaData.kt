package com.example.demo.flashcard

import com.example.demo.repository.MetaData

data class MetaData(
    var flashcardSetName: String,
    var categories: List<String>,
    var wordTypes: List<String>
) {
    constructor(metaData: MetaData) : this(
        flashcardSetName = metaData.flashcardSetName,
        categories = metaData.categoryList,
        wordTypes = metaData.wordTypeList
    )
}
