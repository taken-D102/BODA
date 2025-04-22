package com.taken.boda.presentation.auth.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    application: Application,
    private val authReducer: AuthReducer
) : AndroidViewModel(application) {

    private val _uiState = MutableStateFlow<AuthUiState>(AuthUiState())
    val uiState = _uiState.asStateFlow()
}