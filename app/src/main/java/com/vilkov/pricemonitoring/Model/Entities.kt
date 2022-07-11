package com.vilkov.pricemonitoring.Model.Entities

import java.util.*


data class User(val name: String,
                val password: String)

data class Product(val id: String,
                   val name: String,
                   val price: Price,
                   val date: Date,
                   val url: String)

data class Price(val amount: String,
                 val Currency: String)

data class Message(
    var status: Boolean = false,
    var textMessage: String = "")
