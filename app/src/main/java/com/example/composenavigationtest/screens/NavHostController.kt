package com.example.composenavigationtest.screens

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.composenavigationtest.MainActivity.Companion.ARG_ID
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun HostController(
    navHostController: androidx.navigation.NavHostController,
    destination: String,
    defaultRouteArg: String? = null
) {
    AnimatedNavHost(navController = navHostController, startDestination = destination) {
        composable(
            route = Screens.UserInfo.route
        ) {
            UserInfo()
        }
        composable(
            route = "${Screens.Profile.route}/${ARG_ID}",
            arguments = listOf(navArgument(ARG_ID) {
                type = NavType.StringType; defaultValue = defaultRouteArg ?: "default"
            }),
        ) {
            Profile(it.arguments)
        }
    }
}