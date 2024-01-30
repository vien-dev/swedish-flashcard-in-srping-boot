package com.example.demo.repository

import org.springframework.data.mongodb.core.mapping.Document

@Document("swedishflashcardflashcardsetmetadatas")
data class MetaData(
    val flashcardSetName: String,
    val categoryList: List<String>,
    val wordTypeList: List<String>
)
