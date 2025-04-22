package com.taken.boda.presentation.map.viewmodel

import javax.inject.Inject

class MapReducer @Inject constructor() {

    fun reduce(currentState: MapUiState, intent: MapIntent): MapUiState = when (intent) {
        is MapIntent.SelectDevice -> {
            currentState.copy(
                isLoading = false
            )
        }
    }
}