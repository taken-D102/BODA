package com.taken.boda.presentation.map.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(
    application: Application,
    private val mapReducer: MapReducer
) : AndroidViewModel(application) {

    private val _uiState = MutableStateFlow<MapUiState>(MapUiState())
    val uiState = _uiState.asStateFlow()
}