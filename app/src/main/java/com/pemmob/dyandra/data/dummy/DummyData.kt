package com.pemmob.dyandra.data.dummy

import com.pemmob.dyandra.data.model.Category
import com.pemmob.dyandra.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        // Makanan
        Product(1, 1, categories[0], "Kripik Singkong", "Kripik gurih", 15000.0, 30, "dummy_product"),
        Product(2, 1, categories[0], "Mendoan", "Gorengan khas Purbalingga", 20000.0, 50, "dummy_product"),
        Product(3, 1, categories[0], "Sale Pisang", "Manis dan renyah", 25000.0, 20, "dummy_product"),
        Product(4, 1, categories[0], "Getuk Goreng", "Getuk khas", 30000.0, 40, "dummy_product"),
        Product(5, 1, categories[0], "Nopia", "Makanan khas", 22000.0, 25, "dummy_product"),

        // Minuman
        Product(6, 2, categories[1], "Es Dawet", "Dawet segar", 10000.0, 100, "dummy_product"),
        Product(7, 2, categories[1], "Kopi Badamek", "Kopi lokal", 18000.0, 15, "dummy_product"),
        Product(8, 2, categories[1], "Es Kelapa Muda", "Segar alami", 12000.0, 30, "dummy_product"),
        Product(9, 2, categories[1], "Teh Poci", "Teh melati", 8000.0, 50, "dummy_product"),
        Product(10, 2, categories[1], "Sirup Blimbing", "Olahan rasa", 25000.0, 10, "dummy_product"),

        // Kerajinan
        Product(11, 3, categories[2], "Batik Purbalingga", "Kain batik", 150000.0, 5, "dummy_product"),
        Product(12, 3, categories[2], "Sapu Glagah", "Sapu tradisional", 35000.0, 12, "dummy_product"),
        Product(13, 3, categories[2], "Tas Anyaman", "Tas unik", 45000.0, 10, "dummy_product"),
        Product(14, 3, categories[2], "Gantungan Kunci", "Cenderamata", 5000.0, 100, "dummy_product"),
        Product(15, 3, categories[2], "Ukiran Kayu", "Hiasan dinding", 200000.0, 3, "dummy_product")
    )
}

