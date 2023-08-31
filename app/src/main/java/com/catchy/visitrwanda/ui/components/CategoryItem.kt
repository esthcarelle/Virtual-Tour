package com.catchy.visitrwanda.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.catchy.visitrwanda.model.Category
import com.catchy.visitrwanda.viewModel.CategoryViewModel

@Composable
fun CategoryItem(modifier : Modifier = Modifier, category: Category) {

    Box(modifier = modifier.wrapContentSize().padding(16.dp)){
        Card(modifier = Modifier.size(170.dp)) {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current).data(category.categoryUrl).build(),
                contentDescription = "Wall paper image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }
        Text(text = category.categoryName, fontSize = 16.sp, color = Color.White, modifier = modifier.align(Alignment.BottomStart).padding(16.dp))
    }
}