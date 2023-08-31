package com.catchy.visitrwanda.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.catchy.visitrwanda.viewModel.CategoryViewModel

@Composable
fun CategoryScreen() {
    Column {
        CategoryName(name = "Travel plannings", fontSize = 24.sp, modifier = Modifier.padding(16.dp))
        CategoryList(numberOfRows = 2, viewModel = CategoryViewModel())
    }
}