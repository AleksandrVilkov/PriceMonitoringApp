package com.vilkov.pricemonitoring.PMConnector

import com.vilkov.pricemonitoring.PMConnector.HTTPClient
import org.xml.sax.DTDHandler
import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.sql.SQLData
import java.util.*

class PMConnector internal constructor() {
   private val httpClient: HTTPClient = HTTPClient()
    var mainPath: String? = null
    val prop: Properties =Properties()

    init {
        try {
            val file =
                File("C:\\Users\\vilko\\AndroidStudioProjects\\PriceMonitoring\\app\\src\\main\\java\\com\\vilkov\\pricemonitoring\\PMConnector\\property.properties")
            prop.load(FileReader(file))
            mainPath = prop.getProperty("host") + prop.getProperty("versionAPI")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun sendGET(path: String) = httpClient.sendGetRequest(mainPath + path)
    fun sendPost(path: String, params: Map<String, String>) =
        httpClient.sendPostRequest(mainPath + path, params)
}