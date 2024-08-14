import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.example.issuestask.components.CustomTextStyles.BoldText
import com.example.issuestask.components.CustomTextStyles.MediumText

@Composable
fun CustomButton(text: String) {
    Spacer(modifier = Modifier.height(60.dp))
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp, vertical = 20.dp)
            .border( // Add border modifier here
                BorderStroke(width = 1.dp, color = Color.Green) // Set border width and color
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Green
        ),
        shape = RectangleShape
    ) {
        MediumText(text = text, color = Color.Green, size = 21)
    }
}
