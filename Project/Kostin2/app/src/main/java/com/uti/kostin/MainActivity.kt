package com.uti.kostin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.uti.kostin.ui.theme.KostinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // A surface container using the 'background' color from the theme
        setContent {
            KostinTheme {

            }
        }
    }

    data class Item(val name: String)

    @Composable
    fun KostinApp() {
        val items = listOf(
            Item("Item 1"),
            Item("Item 2"),
            Item("Item 3"),
            Item("Item 4"),
            Item("Item 5"),
            Item("Item 6"),
            Item("Item 7"),
            Item("Item 8"),
            Item("Item 9"),
            Item("Item 10")
        )

        KostinTheme {
            Surface(color = MaterialTheme.colorScheme.background) {
                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    items(items) { item ->
                        ItemCard(item)
                    }
                }
            }
        }
    }

    @Composable
    fun ItemCard(item: Item) {
        // Custom layout for displaying item
        // Modify this according to your design
        Text(
            text = item.name,
            modifier = Modifier.padding(16.dp)
        )
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        KostinTheme {
        }
    }
}