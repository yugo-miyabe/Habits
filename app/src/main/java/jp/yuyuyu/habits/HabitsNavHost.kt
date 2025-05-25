package jp.yuyuyu.habits

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import jp.yuyuyu.home.navigation.homeNavGraph

@Composable
fun HabitsNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "habit_list"
    ) {
        homeNavGraph(navController, {
            // TODO
        })
    }
}
