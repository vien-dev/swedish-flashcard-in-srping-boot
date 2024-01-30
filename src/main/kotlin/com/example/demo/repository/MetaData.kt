package com.example.demo.repository

import org.springframework.data.mongodb.core.mapping.Document

@Document("swedishflashcardflashcardsetmetadatas")
data class MetaData(
    private var flashcardSetName: String,
    private var categoryList: List<String>,
    private var wordTypeList: List<String>
)
