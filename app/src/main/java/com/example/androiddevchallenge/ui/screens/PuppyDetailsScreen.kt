package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.ui.components.Toolbar

@ExperimentalFoundationApi
@Composable
fun PuppyDetailsScreen(
    puppyId: Int,
    navigateBack: () -> Unit
) {
    Column {
        Toolbar()
    }
}
