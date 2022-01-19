package com.example.patterns.fabric_method

class HRCompany(type: String): ACompany() {
    var companyType = type
    override fun startWorking() {
        if (companyType == "water")
            println("Мы ищем боцманов")
        else
            println("Мы ищем реальных водил")
    }

}