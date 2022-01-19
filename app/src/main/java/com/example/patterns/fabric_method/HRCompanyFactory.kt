package com.example.patterns.fabric_method

class HRCompanyFactory: AFactory {
    //фабричный метод
    override fun createCompany(type: String): ACompany {
        return HRCompany(type)
    }
}