package br.com.example.poc.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Account(@Id val id: String
              , val number: String
              , val customerId: String
              , val amount: Int)