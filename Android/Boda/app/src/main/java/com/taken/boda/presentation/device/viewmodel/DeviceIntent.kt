package com.taken.boda.presentation.device.viewmodel

sealed class DeviceIntent {

    data object DeviceNameUpdate : DeviceIntent()
}