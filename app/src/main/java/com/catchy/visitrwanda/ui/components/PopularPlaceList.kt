package com.catchy.visitrwanda.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.catchy.visitrwanda.viewModel.PopularPlaceViewModel

@Composable
fun PopularPlaceList(
    viewModel: PopularPlaceViewModel,
    numberOfRows: Int = 1
) {
    val places by viewModel.mutableData.observeAsState(emptyList())
    if (places.isNotEmpty()) {
        val split = places.chunked(places.size / numberOfRows)

        LazyColumn {
            itemsIndexed((0 until numberOfRows).map { it.toString() }) { index, _ ->
                if (split.isNotEmpty())
                    LazyRow {
                        items(split[index]) {
                            PopularPlace(place = it)
                        }
                    }
            }
        }
    }
}