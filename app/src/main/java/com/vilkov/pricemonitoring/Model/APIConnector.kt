package com.vilkov.pricemonitoring.Model

interface APIConnector {
    fun sendGetRequest(url: String): String
    fun sendPostRequest(url: String, params: Map<String, String>): String
}