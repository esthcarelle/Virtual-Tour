package com.catchy.visitrwanda.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.catchy.visitrwanda.R

@Composable
fun CategoryName(
    name: String,
    textColor: Color = colorResource(id = R.color.category_name_color),
    modifier: Modifier = Modifier,
    fontWeight: FontWeight = FontWeight.ExtraBold,
    fontSize: TextUnit
) {
    Text(
        text = name,
        fontWeight = fontWeight,
        fontSize = fontSize,
        color = textColor,
        modifier = modifier
    )
}

@Composable
@Preview
fun PreviewCategoryName() {
    CategoryName(
        name = "Let's travel together", fontSize = 20.sp, modifier = Modifier.padding(16.dp)
    )
}