package com.example.lesson6task4kotlin.Model

import java.io.Serializable

class User(  var name: String) : Serializable {

    override fun toString(): String {
        return "User(name='$name')"
    }

    fun getLastName(): String {
        return name

    }
}