package com.francotripi.core.domain.model

sealed class Gender(val name: String) {
    object Male: Gender("male")
    object Female: Gender("female")

    companion object {
        fun fromString(name: String): Gender =
            when (name) {
                "male" -> Male
                "female" -> Female
                else -> Female
            }
    }
}
