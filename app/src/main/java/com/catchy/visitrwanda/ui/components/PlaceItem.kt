package com.catchy.visitrwanda.ui.components

import android.graphics.Typeface
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.catchy.visitrwanda.model.Place

@Composable
fun PlaceItem(place: Place) {
    Row(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Card(modifier = Modifier.size(150.dp)) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current).data(place.url).build(),
                contentDescription = "Wall paper image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }
        Column {
            Text(
                text = place.name,
                modifier = Modifier.padding(16.dp),
                color = Color(0XFF69696b),
                fontFamily = FontFamily(
                    Typeface.DEFAULT_BOLD
                )
            )

            Text(
                text = place.description,
                modifier = Modifier.padding(horizontal = 16.dp),
                color = Color(0XFFefeff8),
                fontFamily = FontFamily(
                    Typeface.DEFAULT
                )
            )
        }
    }
}

@Composable
@Preview
fun PlacePreview() {
    PlaceItem(
        place = Place(
            name = "Convention Center",
            id = 1,
            description = "Description",
            url = ""
        )
    )
}