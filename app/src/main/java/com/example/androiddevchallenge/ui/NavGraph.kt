package com.example.androiddevchallenge.ui

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.ui.Destinations.PuppyDetails

object Destinations {
    const val Home = "home"
    const val PuppyDetails = "puppyDetails"

    object PuppyDetailArgs {
        const val PuppyId = "puppyId"
    }
}

class Actions(navController: NavHostController) {
    val openDetails: (Int) -> Unit = { puppyId ->
        navController.navigate("$PuppyDetails/$puppyId")
    }
    val navigateBack: () -> Unit = {
        navController.popBackStack()
    }
}