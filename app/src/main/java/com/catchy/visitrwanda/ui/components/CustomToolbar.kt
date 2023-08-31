package com.catchy.visitrwanda.ui.components

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomToolbar(title: String) {
    TopAppBar(
        title = { Text(text = title) },
        navigationIcon = {
            Icon(imageVector = Icons.Default.AccountBox, contentDescription = "Title")
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Outlined.Search, contentDescription = "Search")
            }
        }

    )
}

@Preview
@Composable
fun PreviewAppBar() {
    CustomToolbar("Visit Rwanda")
}