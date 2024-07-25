package com.groupec.selectbarsampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.groupec.selectbarsampleapp.ui.theme.SelectBarSampleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SelectBarSampleAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    AutoCompleteSelectBar(entries = getWords())
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SelectBarSampleAppTheme {
        Greeting("Android")
    }
}

fun getWords() = listOf(
    "air",
    "rain",
    "chair",
    "hair",
    "fair",
    "pair",
    "stair",
    "snail",
    "train",
    "chain",
    "paint",
    "main",
    "brain",
    "said",
    "laid",
    "plaid",
    "afraid",
    "daily",
    "fail",
    "jail"
)