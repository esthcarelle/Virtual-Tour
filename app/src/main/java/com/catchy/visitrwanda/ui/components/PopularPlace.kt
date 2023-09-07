package com.catchy.visitrwanda.ui.components

import android.graphics.Typeface
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.catchy.visitrwanda.R
import com.catchy.visitrwanda.model.Place

@Composable
fun PopularPlace(place: Place) {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .wrapContentSize()
            .clip(shape = RoundedCornerShape(16.dp))
            .background(Color.White)
    ) {
        Card(modifier = Modifier
            .size(150.dp)
            .padding(8.dp)
            .align(CenterVertically)) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current).data(place.url).build(),
                contentDescription = "Wall paper image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = place.name,
                modifier = Modifier.padding(vertical = 16.dp),
                color = Color(0XFF69696b),
                fontFamily = FontFamily(
                    Typeface.DEFAULT_BOLD
                )
            )

            Text(
                text = place.description,
                modifier = Modifier,
                color = colorResource(id = R.color.category_name_color),
                fontFamily = FontFamily(
                    Typeface.DEFAULT
                )
            )

            Row(modifier = Modifier.padding(vertical = 16.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_star_24),
                    contentDescription = "Star Icon"
                )
                Text(
                    text = place.ratings,
                    modifier = Modifier
                        .align(CenterVertically)
                        .padding(horizontal = 6.dp),
                    color = colorResource(id = R.color.category_name_color),
                    fontFamily = FontFamily(
                        Typeface.DEFAULT
                    ),
                    fontSize = 14.sp
                )
                Text(
                    text = "See Details",
                    modifier = Modifier
                        .padding(horizontal = 3.dp)
                        .align(CenterVertically),
                    color = colorResource(id = R.color.teal_700),
                    fontFamily = FontFamily(
                        Typeface.DEFAULT
                    )
                )
            }
        }
    }
}

@Composable
@Preview
fun PopularPlacePreview() {
    PopularPlace(
        place = Place(
            name = "Convention Center",
            id = 1,
            description = "Description",
            url = "",
            ratings = "4.5"
        )
    )
}