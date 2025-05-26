package jp.yuyuyu.ui.template

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import jp.yuyuyu.ui.organisms.TopBar

@Composable
fun HomeTemplate(
    onSettingClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            TopBar(
                actions = {
                    IconButton(onClick = onSettingClick) {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = null,
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
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
    HomeTemplate(
        onSettingClick = { /* preview */ }
    )
}
