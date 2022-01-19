package com.example.patterns.fabric_method

class Ship: Transport {
    override fun deliver() {
        println("Доставлю по воде")
    }
}