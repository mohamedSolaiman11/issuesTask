import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.issuestask.R

@Composable
fun IssuesScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        CustomAppBar(
            title = R.string.title_of_app_bar,
            titleStyle = TextStyle(fontSize = 24.sp),
            color = Color.Black,
            showBackButton = true,
            onBackButtonClicked = {
                println("clicked")
            }
        )
        CustomIssuesList()
    }
}
