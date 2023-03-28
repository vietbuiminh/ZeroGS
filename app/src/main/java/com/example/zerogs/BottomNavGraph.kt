package com.example.zerogs

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.zerogs.screens.DonateScreen
import com.example.zerogs.screens.HomeScreen
import com.example.zerogs.screens.MapsScreen
import com.example.zerogs.screens.ProfileScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Maps.route) {
            MapsScreen()
        }
        composable(route = BottomBarScreen.Donate.route) {
            DonateScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
    }
}