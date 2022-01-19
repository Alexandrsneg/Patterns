package com.example.patterns.fabric_method

class TransportCompanyFactory: AFactory {
    //фабричный метод
    override fun createCompany(deliveryType: String): TransportCompany {
        return when (deliveryType) {
            "water" -> SeaCompany()
            else -> RoadCompany()
        }
    }
}