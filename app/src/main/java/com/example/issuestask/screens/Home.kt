package com.example.issuestask.screens
import ErrorScreen
import IssuesScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ErrorScreen()
        }
    }
}






@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ErrorScreen()
}
