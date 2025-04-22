package com.taken.boda.presentation.mypage.viewmodel

sealed class MyPageIntent {

    data object Logout : MyPageIntent()
}