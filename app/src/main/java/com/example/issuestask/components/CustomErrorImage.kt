import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.issuestask.R
import com.example.issuestask.constant.ConstantText

@Composable
fun CustomErrorImage() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Column {
            Spacer(modifier = Modifier.height(120.dp))
            Image(
                painter = painterResource(id = R.drawable.error),
                contentDescription = ConstantText.descForErrorImage,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(320.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))

        }
    }
}
