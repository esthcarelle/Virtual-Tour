package com.catchy.visitrwanda.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.catchy.visitrwanda.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomToolbar(title: String) {
    TopAppBar(
        title = { Text(text = title) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = colorResource(id = R.color.teal_700),
            titleContentColor = Color.White,
            actionIconContentColor = Color.White
        ),
        navigationIcon = {
            Icon(
                imageVector = Icons.Default.AccountBox,
                tint = Color.White,
                contentDescription = "Title",
                modifier = Modifier.padding(paddingValues = PaddingValues(8.dp, 0.dp, 4.dp, 0.dp))
            )
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