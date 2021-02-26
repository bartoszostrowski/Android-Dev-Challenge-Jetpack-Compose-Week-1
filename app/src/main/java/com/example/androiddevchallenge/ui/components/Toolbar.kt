package com.example.androiddevchallenge.ui.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme

@Preview
@Composable
fun Toolbar() {
    MyTheme {
        TopAppBar(
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }, enabled = false) {
                    Icon(
                        painter = painterResource(R.drawable.bone),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            },
            title = { Text(text = stringResource(id = R.string.app_name)) },
            actions = {
                IconButton(onClick = {}) {
                    Icon(
                        Icons.Filled.FilterList,
                        contentDescription = "Filter puppies",
                        tint = MaterialTheme.colors.onPrimary
                    )
                }
            }
        )
    }
}