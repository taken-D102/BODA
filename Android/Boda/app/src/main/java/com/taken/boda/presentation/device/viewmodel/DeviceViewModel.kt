package com.taken.boda.presentation.device.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class DeviceViewModel @Inject constructor(
    application: Application,
    private val deviceReducer: DeviceReducer
) : AndroidViewModel(application) {

    private val _uiState = MutableStateFlow<DeviceUiState>(DeviceUiState())
    val uiState = _uiState.asStateFlow()
}