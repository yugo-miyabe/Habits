package jp.yuyuyu.habits

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import jp.yuyuyu.home.HomeScreen
import jp.yuyuyu.home.navigation.HomeRoute
import jp.yuyuyu.home.navigation.homeNavGraph
import kotlinx.serialization.Serializable

@Serializable
object HomeRoute

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
