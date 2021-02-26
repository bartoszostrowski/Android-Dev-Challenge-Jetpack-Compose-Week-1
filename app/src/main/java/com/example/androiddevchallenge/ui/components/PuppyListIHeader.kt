package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.brownBkg
import com.example.androiddevchallenge.ui.theme.darkBrown

@Preview
@Composable
fun PuppyListHeader(initial: String = "A") {
    MyTheme {
        Row(
            Modifier
                .fillMaxWidth(1f)
                .background(color = brownBkg)
        ) {
            Text(
                text = initial.toUpperCase(),
                color = darkBrown,
                modifier = Modifier.padding(vertical = 2.dp, horizontal = 16.dp)
            )
        }
    }
}
