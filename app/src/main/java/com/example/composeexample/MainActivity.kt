package com.example.composeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.*
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.layout.Padding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

val clicks = +state{0}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mainScreen()
        }
    }
}

@Preview
@Composable
fun ClickyButton() {
    Button("Click Me!", onClick = {clicks.value++})
}

@Preview
@Composable
fun ClicksTextView() {
    Padding(padding = 16.dp){
        Text(clicks.value.toString())
    }
}

@Preview
@Composable
fun mainScreen() {
    MaterialTheme {
        Center {
            Column {
                Center {  ClickyButton() }
                Center { ClicksTextView() }
            }
        }
    }
}

