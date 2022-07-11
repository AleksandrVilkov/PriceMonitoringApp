package com.vilkov.pricemonitoring.PMConnector

import com.vilkov.pricemonitoring.Model.Entities.Price
import com.vilkov.pricemonitoring.Model.Entities.Product
import com.vilkov.pricemonitoring.Model.Entities.User
import org.junit.Test
import java.util.*

class HandlerTest{

    @Test
    fun getObjectsTest() {
        val handler = Handler()
        val user = User("436641871", "Subaru54")
        val allProducts: List<Product> = handler.getObjects(Product("","", Price("",""), Date(),""), user) as List<Product>
    }
}
