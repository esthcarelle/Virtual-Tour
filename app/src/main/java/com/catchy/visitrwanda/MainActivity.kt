package com.catchy.visitrwanda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.catchy.visitrwanda.model.Category
import com.catchy.visitrwanda.ui.components.CategoryItem
import com.catchy.visitrwanda.ui.theme.VisitRwandaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisitRwandaTheme {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    CategoryItem(modifier = Modifier, category = Category(id = 1, categoryName = "Hiking",categoryUrl = "https://c4.wallpaperflare.com/wallpaper/362/276/920/nature-4k-pc-full-hd-wallpaper-preview.jpg"))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VisitRwandaTheme {
        Greeting("Android")
    }
}