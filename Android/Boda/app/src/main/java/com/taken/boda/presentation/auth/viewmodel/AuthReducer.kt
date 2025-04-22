package com.taken.boda.presentation.auth.viewmodel

import javax.inject.Inject

class AuthReducer @Inject constructor() {

    fun reduce(currentState: AuthUiState, intent: AuthIntent): AuthUiState = when (intent) {
        is AuthIntent.Login -> {
            currentState.copy(
                isLoading = false
            )
        }
    }
}