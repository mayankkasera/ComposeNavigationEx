package com.example.myapplication.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavArgument
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.myapplication.screens.DetailScreen
import com.example.myapplication.screens.HomeScreen

private const val TAG = "NavGraph123"

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(
            route = Screen.HomeScreen.route
        ) {
            HomeScreen(navController)
        }

        composable(
            route = Screen.DetailScreen.route,
            arguments = listOf(
                navArgument(DETAIL_SCREEN_ARGS_ID) {
                    type = NavType.IntType
                },
                navArgument(DETAIL_SCREEN_ARGS_QUERY) {
                    type = NavType.StringType
                }
            )
        ) {
            Log.i(TAG, "SetUpNavGraph: ${it.arguments?.getInt(DETAIL_SCREEN_ARGS_ID)}")
            Log.i(TAG, "SetUpNavGraph: ${it.arguments?.getString(DETAIL_SCREEN_ARGS_QUERY)}")
            DetailScreen(navController)
        }

    }
}