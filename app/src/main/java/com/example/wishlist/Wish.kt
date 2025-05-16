package com.example.wishlist

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = "",
)

object DummyWish {
    val wishList = listOf(
        Wish(1, "iPhone 15", "iPhone 15 Pro Max"),
        Wish(2, "MacBook Air", "MacBook Air M3"),
        Wish(3, "iPad Air", "iPad Air M2"),
    )
}
