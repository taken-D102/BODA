package com.taken.boda.presentation.home.viewmodel

sealed class HomeIntent {

    data class DeviceUpdate(val deviceId: Int) : HomeIntent()
}