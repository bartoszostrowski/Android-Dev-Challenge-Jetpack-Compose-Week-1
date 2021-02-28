package com.example.androiddevchallenge.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme

@Preview
@Composable
fun ToolbarDetails(
    puppy: Puppy,
    navigateUp: () -> Unit
) {
    MyTheme {
        TopAppBar(
            navigationIcon = {
                IconButton(onClick = navigateUp) {
                    Icon(
                        Icons.Filled.ArrowBack,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            },
            title = { Text(text = puppy.name) },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.FavoriteBorder,
                        contentDescription = "Add to favorites",
                        tint = MaterialTheme.colors.onPrimary
                    )
                }
            }
        )
    }
}
