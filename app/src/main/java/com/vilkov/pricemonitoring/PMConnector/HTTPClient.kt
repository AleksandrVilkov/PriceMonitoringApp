package com.vilkov.pricemonitoring.PMConnector

import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HTTPClient {


}

fun simpleCase() {
    val client = HttpClient()

    GlobalScope.launch(Dispatchers.IO) {
        val data = client.get<String>("http://localhost:8080/api/analytics/getDynamicPrice?clientID=436641871&password=Subaru54")
    }
}