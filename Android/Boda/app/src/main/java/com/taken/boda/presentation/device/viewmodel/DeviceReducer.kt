package com.taken.boda.presentation.device.viewmodel

import javax.inject.Inject

class DeviceReducer @Inject constructor() {

    fun reduce(currentState: DeviceUiState, intent: DeviceIntent): DeviceUiState = when (intent) {
        is DeviceIntent.DeviceNameUpdate -> {
            currentState.copy(
                isLoading = false
            )
        }
    }
}