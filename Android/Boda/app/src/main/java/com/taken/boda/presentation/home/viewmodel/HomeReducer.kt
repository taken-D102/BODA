package com.taken.boda.presentation.home.viewmodel

import javax.inject.Inject

class HomeReducer @Inject constructor() {

    fun reduce(currentState: HomeUiState, intent: HomeIntent): HomeUiState = when (intent) {
        is HomeIntent.DeviceUpdate -> {
            currentState.copy(
                isLoading = false
            )
        }
    }
}