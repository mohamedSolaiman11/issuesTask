import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.issuestask.R
import com.example.issuestask.components.CustomTextStyles.BoldText
import com.example.issuestask.components.CustomTextStyles.RegularText
import com.example.issuestask.constant.ConstantText

@Composable
fun ErrorScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize().background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomAppBar(
            title = R.string.appBarTitleInErrorPage,
            titleStyle = TextStyle(fontSize = 24.sp),
            color = Color.Black,
            onBackButtonClicked = {}
        )
        CustomErrorImage()
        BoldText(text = ConstantText.somethingWentWrong, size = 24)
        RegularText(text = ConstantText.networkError, size = 20, color = Color.Gray)
        CustomButton(text = ConstantText.retry)

    }
}
