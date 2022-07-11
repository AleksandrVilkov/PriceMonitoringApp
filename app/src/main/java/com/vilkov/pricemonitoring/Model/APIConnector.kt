package com.vilkov.pricemonitoring.Model

import com.vilkov.pricemonitoring.Model.Entities.EntityType
import com.vilkov.pricemonitoring.Model.Entities.User

interface APIConnector {
    fun getObjects(type: EntityType, user: User): String
    fun deleteObjects(objects: List<Any>, user: User): Boolean
    fun  createObjects(objects: List<Any>, user: User): Boolean
    fun updateObjects(objects: List<Any>, user: User): Boolean
}