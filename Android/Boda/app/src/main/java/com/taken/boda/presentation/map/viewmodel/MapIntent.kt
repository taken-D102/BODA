package com.taken.boda.presentation.map.viewmodel

sealed class MapIntent {

    data class SelectDevice(val deviceId: Int) : MapIntent()
}