package com.example.patterns.fabric_method

class SeaCompany: TransportCompany() {
    override fun createTransport(): Transport {
        return Ship()
    }
}