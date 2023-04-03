package com.example.composenavigationtest.screens

import android.os.Bundle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.composenavigationtest.MainActivity.Companion.ARG_ID

@Composable
fun Profile(arguments: Bundle?) {
    Text(text = "Profile screen ${arguments?.getString(ARG_ID)}")
}