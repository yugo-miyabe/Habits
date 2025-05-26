package jp.yuyuyu.ui.template

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeTemplate(
    onSettingClick: () -> Unit,
) {
    Scaffold { innerPadding ->
        Text(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxHeight(),
            text = "Home"
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun HomeTemplatePreview() {
    HomeTemplate()
}
