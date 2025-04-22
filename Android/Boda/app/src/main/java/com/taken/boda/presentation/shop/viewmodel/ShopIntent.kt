package com.taken.boda.presentation.shop.viewmodel

sealed class ShopIntent {

    data class SelectProduct(val productId: Int): ShopIntent()
}