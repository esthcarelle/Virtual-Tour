package com.catchy.visitrwanda.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.catchy.visitrwanda.viewModel.CategoryViewModel

@Composable
fun CategoryList(
    viewModel: CategoryViewModel = CategoryViewModel(),
    numberOfRows: Int = 1,
    numberOfColumns: Int = 2
) {
    val categories by viewModel.mutableData.observeAsState(emptyList())
    val split = categories.chunked(numberOfColumns)

    LazyColumn {
        itemsIndexed((0 until numberOfRows).map { it.toString() }) { index, _ ->
            if (split.isNotEmpty())
                LazyRow {
                    items(split[index]) {
                        CategoryItem(category = it)
                    }
                }
        }
    }
}