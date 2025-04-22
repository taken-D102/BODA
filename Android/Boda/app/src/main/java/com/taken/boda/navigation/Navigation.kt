package com.taken.boda.navigation

sealed class Navigation(val destination: String) {

    data object Splash : Navigation("splash")

    data object Auth : Navigation("auth")

    data object Home : Navigation("home")

    data object Device : Navigation("device")

    data object Map : Navigation("map")

    data object MyPage : Navigation("mypage")

    data object Shop : Navigation("shop")
}

sealed class Route(val value: String) {

    data object Home : Navigation("home")
}