package com.vilkov.pricemonitoring.PMConnector


import com.vilkov.pricemonitoring.Model.APIConnector
import com.vilkov.pricemonitoring.Model.Entities.*
import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.util.*

class PMConnector internal constructor() : APIConnector {
    private val httpClient: HTTPClient = HTTPClient()
    var mainPath: String? = null
    val prop: Properties = Properties()

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

    override fun getObjects(type: EntityType, user: User): List<Any> {
        val response: String
        when (type) {
            EntityType.PRODUCT -> {
                response = sendPost(
                    prop.getProperty("getAllClientsProducts"),
                    mapOf("clientID" to user.name, "password" to user.password)
                )
            }
            EntityType.USER_URL -> {
                response = sendPost(
                    prop.getProperty("getAllUrls"),
                    mapOf("clientID" to user.name, "password" to user.password)
                )

            }

            EntityType.PRICE -> {

            }

            EntityType.USER -> {

            }
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

    private fun sendGET(path: String) = httpClient.sendGetRequest(mainPath + path)
    private fun sendPost(path: String, params: Map<String, String>) =
        httpClient.sendPostRequest(mainPath + path, params)
}