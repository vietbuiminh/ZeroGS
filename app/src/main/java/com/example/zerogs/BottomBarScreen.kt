package com.example.zerogs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Maps: BottomBarScreen(
        route = "maps",
        title = "Maps",
        icon = Icons.Default.Place
    )
    object Donate: BottomBarScreen(
        route = "donate",
        title = "Donate",
        icon = Icons.Default.FavoriteBorder
    )
    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.AccountCircle
    )
}
