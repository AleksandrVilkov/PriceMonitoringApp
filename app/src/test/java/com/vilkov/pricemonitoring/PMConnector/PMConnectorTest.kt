package com.vilkov.pricemonitoring.PMConnector

import com.vilkov.pricemonitoring.Model.Entities.EntityType
import com.vilkov.pricemonitoring.Model.Entities.Price
import com.vilkov.pricemonitoring.Model.Entities.Product
import com.vilkov.pricemonitoring.Model.Entities.User
import org.junit.Test
import java.util.*

class PMConnectorTest{

    @Test
    fun getObjectsTest() {
        val pmConnector = PMConnector()
        val user = User("436641871", "Subaru54")
        val allProducts: List<Product> = pmConnector.getObjects(EntityType.PRODUCT, user) as List<Product>
    }
}
