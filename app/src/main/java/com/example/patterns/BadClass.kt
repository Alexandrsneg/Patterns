package com.example.patterns

class BadPersonClass(var name: String, var lastName: String) {
    private var nickname: String? = null
    private var age: Int? = null
    private var weight: Int? = null
    private var height: Int? = null

    constructor(name: String, lastName: String, nickname: String) : this(name, lastName) {
        this.nickname = nickname
    }

    constructor(name: String, lastName: String, nickname: String, age: Int) : this(name, lastName) {
        this.nickname = nickname
        this.age = age
    }

    constructor(name: String, lastName: String, nickname: String, age: Int, weight: Int ) : this(name, lastName) {
        this.nickname = nickname
        this.age = age
        this.weight = weight
    }

    fun mainInfo(): String {
        return "$name $lastName"
    }

    fun getWeight() = weight
    fun getHeight() = height
}

val badPerson = BadPersonClass("sasha", "ivanov", "bigBoy69")