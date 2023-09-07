package com.catchy.visitrwanda.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.catchy.visitrwanda.viewModel.CategoryViewModel
import com.catchy.visitrwanda.viewModel.PopularPlaceViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen() {
    Scaffold(topBar = { CustomToolbar(title = "Visit Rwanda") }) {
        Column {
            CategoryName(name = "Travel plannings", fontSize = 24.sp, modifier = Modifier.padding(16.dp))
            CategoryList(numberOfRows = 2, viewModel = CategoryViewModel())
            CategoryName(name = "Popular places", fontSize = 24.sp, modifier = Modifier.padding(16.dp))
            PopularPlaceList(viewModel = PopularPlaceViewModel(), numberOfRows = 1)
        }
    }
}