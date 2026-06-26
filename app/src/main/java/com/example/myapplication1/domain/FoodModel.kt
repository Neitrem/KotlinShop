package com.example.myapplication1.domain

import kotlinx.serialization.Serializable

@Serializable
data class FoodModel(
    var bestFood: Boolean = false,
    var categoryID: String ="",
    var description: String = "",
    var id: Int = 0,
    var imagePath: String = "",
    var locationID: Int = 0,
    var price: Double = 0.0,
    var priceID: String = "",
    var star: Double = 0.0,
    var timeID: Int = 0,
    var timeValue: Int = 0,
    var title: String = "",
    var calorie: Int = 0,
    var numberInCart: Int = 0
)

