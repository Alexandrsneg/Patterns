package com.example.patterns.fabric_method

fun main() {
    var factory: AFactory? = null
    var isNeedTransportCompany = false

    if (isNeedTransportCompany)
        factory = TransportCompanyFactory()
    else
        factory = HRCompanyFactory()

    val company = factory.createCompany("water")
    company.startWorking()
}