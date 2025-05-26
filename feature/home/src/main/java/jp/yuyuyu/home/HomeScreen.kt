package jp.yuyuyu.home

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import jp.yuyuyu.ui.template.HomeTemplate

@Composable
fun HomeScreen(
    onSettingClick: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel(),
) {
    HomeTemplate(onSettingClick = onSettingClick)
}
