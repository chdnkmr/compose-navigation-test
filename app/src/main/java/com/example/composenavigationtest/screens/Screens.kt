package com.example.composenavigationtest.screens

sealed class Screens(val route: String){
    object UserInfo: Screens("UserInfo")
    object Profile: Screens("Profile")
}
