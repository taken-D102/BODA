package com.taken.boda.presentation.shop.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ShopViewModel @Inject constructor(
    application: Application,
    private val shopReducer: ShopReducer
) : AndroidViewModel(application) {

    private val _uiState = MutableStateFlow<ShopUiState>(ShopUiState())
    val uiState = _uiState.asStateFlow()
}