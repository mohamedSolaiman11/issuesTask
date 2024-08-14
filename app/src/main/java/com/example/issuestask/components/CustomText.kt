package com.example.issuestask.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object CustomTextStyles {

    @Composable
    fun BoldText(text: String, size: Int = 16, color: Color = Color.Black) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = size.sp,
                fontWeight = FontWeight.Bold,
                color = color
            ),

        )
        Spacer(modifier = Modifier.height(10.dp))
    }

    @Composable
    fun MediumText(text: String, size: Int = 16, color: Color = Color.Black) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = size.sp,
                fontWeight = FontWeight.Medium,
                color = color
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
    }

    @Composable
    fun RegularText(text: String, size: Int = 16, color: Color = Color.Black) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = size.sp,
                fontWeight = FontWeight.Normal,
                color = color
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}
