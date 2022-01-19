package com.example.patterns.fabric_method

interface AFactory {
    fun createCompany(type: String) : ACompany
}