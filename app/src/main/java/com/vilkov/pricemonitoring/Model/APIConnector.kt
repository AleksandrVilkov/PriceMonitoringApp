package com.vilkov.pricemonitoring.Model

interface APIConnector {
fun sendGetRequest(url: String)
fun sendPostRequest(url: String)
}