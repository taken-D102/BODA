package com.taken.boda.presentation.auth.viewmodel

sealed class AuthIntent {

    data object Login : AuthIntent()
}