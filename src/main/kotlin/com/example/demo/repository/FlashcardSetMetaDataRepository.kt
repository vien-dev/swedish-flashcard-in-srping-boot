package com.example.demo.repository

import org.springframework.data.mongodb.repository.MongoRepository

interface FlashcardSetMetaDataRepository : MongoRepository<MetaData, String> {
    override fun findAll(): MutableList<MetaData>

}