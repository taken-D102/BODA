package com.taken.boda.navigation.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.taken.boda.navigation.Navigation
import com.taken.boda.navigation.Route
import com.taken.boda.presentation.auth.AuthScreen
import com.taken.boda.presentation.device.DeviceScreen
import com.taken.boda.presentation.home.HomeScreen
import com.taken.boda.presentation.map.MapScreen
import com.taken.boda.presentation.mypage.MyPageScreen
import com.taken.boda.presentation.shop.ShopScreen
import com.taken.boda.presentation.splash.SplashScreen

@Composable
fun NavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = Navigation.Splash.destination) {
        composable(Navigation.Splash.destination) {
            SplashScreen(onNavigate = { navController.navigate(Navigation.Home.destination) })
        }
        mainNavigation(navController)
    }
}

private fun NavGraphBuilder.mainNavigation(navController: NavHostController) {
    navigation(startDestination = Navigation.Home.destination, route = Route.Home.destination) {
        composable(Navigation.Home.destination) {
            HomeScreen(navController = navController)
        }
        composable(Navigation.Auth.destination) {
            AuthScreen(navController = navController)
        }
        composable(Navigation.Device.destination) {
            DeviceScreen(navController = navController)
        }
        composable(Navigation.Map.destination) {
            MapScreen(navController = navController)
        }
        composable(Navigation.MyPage.destination) {
            MyPageScreen(navController = navController)
        }
        composable(Navigation.Shop.destination) {
            ShopScreen(navController = navController)
        }
    }
}