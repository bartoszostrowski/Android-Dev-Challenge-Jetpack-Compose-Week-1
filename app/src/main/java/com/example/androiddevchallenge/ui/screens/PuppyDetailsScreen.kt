package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.dummyValue
import com.example.androiddevchallenge.ui.components.ToolbarDetails
import com.example.androiddevchallenge.ui.theme.brown
import com.example.androiddevchallenge.ui.theme.darkBrown

@ExperimentalFoundationApi
@Composable
fun PuppyDetailsScreen(
    puppyId: Int,
    navigateBack: () -> Unit
) {
    val puppy: Puppy = dummyValue[puppyId]

    Column(Modifier.fillMaxHeight()) {
        ToolbarDetails(
            puppy = puppy,
            navigateBack = navigateBack
        )
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
                .padding(8.dp)
                .clip(RoundedCornerShape(8.dp)),
            painter = painterResource(id = puppy.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Row() {
            Card(
                Modifier
                    .weight(1f, true)
                    .padding(start = 8.dp, end = 4.dp)
            ) {
                Column(
                    Modifier
                        .background(color = brown.copy(alpha = 0.12f))
                ) {
                    Text(
                        color = darkBrown,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 8.dp),
                        text = "Breed"
                    )
                    Text(
                        modifier = Modifier.padding(
                            start = 8.dp,
                            end = 8.dp,
                            top = 4.dp,
                            bottom = 8.dp
                        ),
                        text = puppy.breed
                    )
                }
            }

            Card(
                Modifier
                    .weight(1f, true)
                    .padding(start = 4.dp, end = 4.dp)
            ) {
                Column(
                    Modifier
                        .background(color = brown.copy(alpha = 0.12f))
                ) {
                    Text(
                        color = darkBrown,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 8.dp),
                        text = "Gender"
                    )
                    Text(
                        modifier = Modifier.padding(
                            start = 8.dp,
                            end = 8.dp,
                            top = 4.dp,
                            bottom = 8.dp
                        ),
                        text = puppy.gender.name
                    )
                }
            }

            Card(
                Modifier
                    .weight(1f, true)
                    .padding(start = 4.dp, end = 8.dp)
            ) {
                Column(
                    Modifier
                        .background(color = brown.copy(alpha = 0.12f))
                ) {
                    Text(
                        color = darkBrown,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 8.dp),
                        text = "Age"
                    )
                    Text(
                        modifier = Modifier.padding(
                            start = 8.dp,
                            end = 8.dp,
                            top = 4.dp,
                            bottom = 8.dp
                        ),
                        text = "${puppy.age} month"
                    )
                }
            }
        }

        Card(
            Modifier
                .fillMaxWidth()
                .weight(1f, true)
                .padding(8.dp)
        ) {
            Column(
                Modifier
                    .background(color = brown.copy(alpha = 0.12f))
            ) {
                Text(
                    color = darkBrown,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 8.dp),
                    text = "Description"
                )
                Text(
                    modifier = Modifier
                        .weight(1f, true)
                        .padding(
                            start = 8.dp,
                            end = 8.dp,
                            top = 4.dp,
                            bottom = 8.dp
                        ),
                    overflow = TextOverflow.Ellipsis,
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
                )
            }
        }

        Row() {
            Button(
                modifier = Modifier
                    .weight(1f, true)
                    .padding(start = 8.dp, end = 4.dp, bottom = 8.dp),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Call")
            }
            Button(
                modifier = Modifier
                    .weight(1f, true)
                    .padding(start = 4.dp, end = 8.dp, bottom = 8.dp),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Book a visit")
            }
        }
    }
}
