package com.example.composenavigationtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composenavigationtest.MainActivity.Companion.ARG_ID
import com.example.composenavigationtest.screens.HostController
import com.example.composenavigationtest.screens.Screens
import com.example.composenavigationtest.ui.theme.ComposeNavigationTestTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }

    companion object
    {
        const val ARG_ID = "id"
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Greeting() {
    Column(Modifier.fillMaxWidth()) {
        val navHostController = rememberAnimatedNavController()
        HostController(
            navHostController = navHostController,
            destination = "${Screens.Profile.route}/${ARG_ID}",
            defaultRouteArg = "5"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeNavigationTestTheme {
        Greeting()
    }
}