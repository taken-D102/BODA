package com.taken.boda.presentation.mypage.viewmodel

import javax.inject.Inject

class MyPageReducer @Inject constructor() {

    fun reduce(currentState: MyPageUiState, intent: MyPageIntent): MyPageUiState = when (intent) {
        is MyPageIntent.Logout -> {
            currentState.copy(
                isLoading = false
            )
        }
    }
}