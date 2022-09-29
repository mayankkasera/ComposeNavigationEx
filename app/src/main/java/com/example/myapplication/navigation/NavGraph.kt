package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.screens.DetailScreen
import com.example.myapplication.screens.HomeScreen

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route){
        composable(
            Screen.HomeScreen.route
        ){
            HomeScreen(navController)
        }

        composable(
            Screen.DetailScreen.route
        ){
            DetailScreen(navController)
        }

    }
}