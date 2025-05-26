package jp.yuyuyu.ui.organisms

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import jp.yuyuyu.ui.theme.HabitsTheme
import jp.yuyuyu.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: String? = null,
    actions: @Composable RowScope.() -> Unit = {},
) {
    TopAppBar(
        title = {
            if (!title.isNullOrEmpty()) {
                Text(
                    text = title,
                    textAlign = TextAlign.Center,
                    style = Typography.labelLarge
                )
            }
        },
        navigationIcon = @Composable {
            // TODO
        },
        actions = actions
    )
}

@PreviewLightDark
@Composable
fun TopBar_Preview() {
    HabitsTheme {
        TopBar(
            actions = {
                IconButton(onClick = { /* preview */ }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = null,
                    )
                }
            }
        )
    }
}
