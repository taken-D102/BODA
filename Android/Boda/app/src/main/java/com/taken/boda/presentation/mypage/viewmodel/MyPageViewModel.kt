package com.taken.boda.presentation.mypage.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MyPageViewModel @Inject constructor(
    application: Application,
    private val myPageReducer: MyPageReducer
) : AndroidViewModel(application) {

    private val _uiState = MutableStateFlow<MyPageUiState>(MyPageUiState())
    val uiState = _uiState.asStateFlow()
}