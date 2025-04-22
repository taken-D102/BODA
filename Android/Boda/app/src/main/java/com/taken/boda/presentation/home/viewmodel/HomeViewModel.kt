package com.taken.boda.presentation.home.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    application: Application,
    private val homeReducer: HomeReducer
) : AndroidViewModel(application) {

    private val _uiState = MutableStateFlow<HomeUiState>(HomeUiState())
    val uiState = _uiState.asStateFlow()
}