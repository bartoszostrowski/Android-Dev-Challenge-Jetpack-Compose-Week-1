package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Gender
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.dummyValue
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.brown
import com.example.androiddevchallenge.ui.theme.primaryText
import com.example.androiddevchallenge.ui.theme.secondaryText

@Preview
@Composable
fun PuppyListItem(
    puppyId: Int = 0,
    onClick: (Int) -> Unit
) {
    val puppy: Puppy = dummyValue[puppyId]
    MyTheme {
        Card(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 4.dp)
                .clickable(onClick = { onClick(puppyId) })
        ) {
            Column(
                Modifier
                    .background(color = brown.copy(alpha = 0.12f))
            ) {
                Row(
                    Modifier
                        .height(96.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        modifier = Modifier.width(120.dp),
                        painter = painterResource(id = puppy.image),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                    Column(modifier = Modifier.weight(1.0f, true)) {
                        Text(
                            text = puppy.name,
                            color = primaryText,
                            modifier = Modifier
                                .weight(1.0f)
                                .padding(start = 16.dp, end = 8.dp, top = 16.dp),
                            fontWeight = FontWeight.Medium,
                        )
                        Text(
                            text = puppy.breed,
                            color = secondaryText,
                            modifier = Modifier
                                .weight(1.0f)
                                .padding(start = 16.dp, end = 8.dp, bottom = 8.dp)
                        )
                    }
                    val genderIcon =
                        if (puppy.gender == Gender.Male) Icons.Filled.Male else Icons.Filled.Female
                    val genderColor = if (puppy.gender == Gender.Male) Color.Blue else Color.Red
                    Icon(
                        genderIcon,
                        contentDescription = null,
                        tint = genderColor.copy(alpha = 0.4f),
                        modifier = Modifier.padding(4.dp)
                    )
                }
            }
        }
    }
}
