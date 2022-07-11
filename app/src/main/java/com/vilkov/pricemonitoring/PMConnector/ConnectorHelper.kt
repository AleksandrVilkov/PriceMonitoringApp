package com.vilkov.pricemonitoring.PMConnector

import android.util.JsonReader
import com.vilkov.pricemonitoring.Model.Entities.Product
import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONStringer

//TODO Методы конвнртации из строки в класс

fun convertJSONToProductList(json: String): List<Product> {
    val jsonObject = JSONObject(json)
    return listOf()
}