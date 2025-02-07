package com.example.cartaamor.margaret

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cartaamor.margaret.ui.theme.MargaretTheme
import com.example.cartaamor.margaret.ui.theme.Pink80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MargaretTheme{}
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // using the surface container to add a background color
    Surface(color = Pink80) {
        Text(
            text = "I love you $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MargaretTheme {
        Greeting("My Margaret")
    }
}
