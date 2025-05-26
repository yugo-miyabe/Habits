package jp.yuyuyu.habits

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import jp.yuyuyu.home.navigation.HomeRoute
import jp.yuyuyu.home.navigation.homeNavGraph
import jp.yuyuyu.setting.navigation.navigateToSetting
import jp.yuyuyu.setting.navigation.settingNavGraph

@Composable
fun HabitsNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = HomeRoute
    ) {
        homeNavGraph(navController::navigateToSetting)

        settingNavGraph()
    }
}
