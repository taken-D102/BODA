package com.taken.boda.presentation.shop.viewmodel

import javax.inject.Inject

class ShopReducer @Inject constructor() {

    fun reduce(currentState: ShopUiState, intent: ShopIntent): ShopUiState = when (intent) {
        is ShopIntent.SelectProduct -> {
            currentState.copy(
                isLoading = false
            )
        }
    }
}