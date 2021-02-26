package com.example.androiddevchallenge.data

data class Puppy(
    val name: String,
    val breed: String,
    val gender: Gender,
    val image: Int,
    val contactNumber: String,
    val age: Int,
    val distance: Float,
    val description: String,
    var favorite: Boolean = false
)

enum class Gender {
    Male,
    Female
}