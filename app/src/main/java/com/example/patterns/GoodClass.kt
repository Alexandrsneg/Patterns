package com.example.patterns

class Person(private val builder: Builder) {
    fun mainInfo() = builder.name + " " + builder.lastName
    fun getWeight() = builder.weight

    class Builder (
        var name: String,
        var lastName: String
    ) {
        var nickname: String? = null
        var age: Int? = null
        var weight: Int? = null
        var height: Int? = null

        fun nickname(value: String) = apply { nickname = value }
        fun age(value: Int) = apply { age = value }
        fun weight(value: Int) = apply { weight = value }
        fun height(value: Int) = apply { height = value }

        fun build(): Person {
            return Person(this)
        }
    }
}

val goodPerson = Person.Builder("Sasha", "Ivanov")
    .nickname("BigBoy69")
    .weight(70)
    .age(28)
    .build()