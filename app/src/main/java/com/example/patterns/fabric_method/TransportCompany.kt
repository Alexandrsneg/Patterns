package com.example.patterns.fabric_method

abstract class TransportCompany: ACompany() {

    override fun startWorking() {
        startDelivery()
    }

    fun startDelivery() {
        println("Я транспортная компания")
        createTransport().deliver()
        println("Позвоню как доставлю")
    }

    //фабричный метод
    abstract fun createTransport() : Transport

}