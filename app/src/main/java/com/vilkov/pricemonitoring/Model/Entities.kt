package com.vilkov.pricemonitoring.Model.Entities

import java.util.*

interface BaseEntity {
    val type: EntityType
}

enum class EntityType {
    USER, PRODUCT, PRICE, MESSAGE, USER_URL
}

data class User(
    val name: String,
    val password: String,
    override val type: EntityType = EntityType.USER
) : BaseEntity

data class Product(
    val id: String,
    val name: String,
    val price: Price,
    val date: Date,
    val url: String,
    override val type: EntityType = EntityType.PRODUCT
) : BaseEntity

data class Price(
    val amount: String,
    val Currency: String,
    override val type: EntityType = EntityType.PRICE
) : BaseEntity

data class Message(
    var status: Boolean = false,
    var textMessage: String = "",
    override val type: EntityType = EntityType.MESSAGE
) : BaseEntity

data class UserUrl(
    var url: String,
    var name: String,
    override val type: EntityType = EntityType.USER_URL
) : BaseEntity
