package com.vilkov.pricemonitoring.PMConnector

import com.vilkov.pricemonitoring.Model.APIConnector
import com.vilkov.pricemonitoring.Model.Entities.Price
import com.vilkov.pricemonitoring.Model.Entities.Product
import com.vilkov.pricemonitoring.Model.Entities.User
import java.io.File
import java.io.FileInputStream
import java.util.*

class Handler : APIConnector {
    val pmConnector = PMConnector()

    override fun getObjects(product: Any, user: User): List<Any> {
        when (product) {
            is Product -> return getProducts(user)
//            is User -> return getUsers()
//            is Price -> return getPrices()
        }
        return listOf()
    }

    override fun deleteObjects(objects: List<Any>, user: User): Boolean {
        TODO("Not yet implemented")
    }

    override fun createObjects(objects: List<Any>, user: User): Boolean {
        TODO("Not yet implemented")
    }

    override fun updateObjects(objects: List<Any>, user: User): Boolean {
        TODO("Not yet implemented")
    }

    private fun getProducts(user: User): List<Product> {
        val response = pmConnector.sendPost(
            pmConnector.prop.getProperty("getAllClientsProducts"),
            mapOf("clientID" to user.name, "password" to user.password)
        )
        //TODO Доделать парсер в объеткы
        return listOf();
    }

    private fun getUsers(): List<User> {
        return listOf();
    }

    private fun getPrices(): List<Price> {
        return listOf();
    }


}