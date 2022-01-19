package com.example.patterns.fabric_method

class RoadCompany: TransportCompany() {
    override fun createTransport(): Transport {
        return Truck()
    }
}