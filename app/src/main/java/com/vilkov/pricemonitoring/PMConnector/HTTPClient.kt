package com.vilkov.pricemonitoring.PMConnector

import com.vilkov.pricemonitoring.Model.APIConnector
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

class HTTPClient : APIConnector {

    override fun sendGetRequest(url: String): String {
        val obj = URL(url)
        with(obj.openConnection() as HttpURLConnection) {
            println("\nSending 'GET' request to URL : $url")
            println("Response Code : $responseCode")
            BufferedReader(InputStreamReader(inputStream)).use {
                val response = StringBuffer()
                var inputLine = it.readLine()
                while (inputLine != null) {
                    response.append(inputLine)
                    inputLine = it.readLine()
                }
                return response.toString()
            }
        }
    }

    override fun sendPostRequest(url: String, params: Map<String, String>): String {
        val mURL = URL(url + getStringParams(params))
        with(mURL.openConnection() as HttpURLConnection) {
            requestMethod = "POST"
            println("URL : $url")
            println("Response Code : $responseCode")
            BufferedReader(InputStreamReader(inputStream)).use {
                val response = StringBuffer()
                var inputLine = it.readLine()
                while (inputLine != null) {
                    response.append(inputLine)
                    inputLine = it.readLine()
                }
                it.close()
                println("Response : $response")
            }
        }
        return ""
    }

    private fun getStringParams(params: Map<String, String>): String {
        var reqParams: String = "?"
        var countAppliedParams = 0
        for(param in params) {
            var reqParam =
                URLEncoder.encode(param.key, "UTF-8") + "=" + URLEncoder.encode(param.value, "UTF-8")
            if (countAppliedParams != params.size) {
                countAppliedParams++
                reqParam += "&"
            }
            reqParams += reqParam
        }
        return reqParams
    }
}
