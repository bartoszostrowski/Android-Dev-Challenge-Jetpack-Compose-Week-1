package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.dummyValue
import com.example.androiddevchallenge.ui.components.PuppyListHeader
import com.example.androiddevchallenge.ui.components.PuppyListItem
import com.example.androiddevchallenge.ui.components.Toolbar

@ExperimentalFoundationApi
@Composable
fun HomeScreen(
    openDetails: (Int) -> Unit
) {
    Column {
        Toolbar()
        val grouped = dummyValue.sortedBy { it.name }.groupBy { it.name[0] }
        LazyColumn(contentPadding = PaddingValues(horizontal = 0.dp, vertical = 4.dp)) {
            grouped.forEach { (initial, puppiesByInitial) ->
                stickyHeader {
                    PuppyListHeader(initial.toString())
                }

                itemsIndexed(puppiesByInitial) { index, item ->
                    PuppyListItem(
                        puppyId = item.id,
                        onClick = openDetails
                    )
                }
            }
        }
    }
}
