package com.example.myapplication.navigation

import android.util.Log
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.myapplication.screens.DetailScreen
import com.example.myapplication.screens.HomeScreen
import com.example.myapplication.screens.LoginScreen
import com.example.myapplication.screens.SignUpScreen

private const val TAG = "NavGraph123"
fun NavGraphBuilder.homeNavGraph(navController: NavHostController){
    navigation(
        startDestination = Screen.HomeScreen.route,
        route = HOME_ROUTE
    ){
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