package com.example.myapplication.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.myapplication.screens.LoginScreen
import com.example.myapplication.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController){
    navigation(
        startDestination = Screen.LoginScreen.route,
        route = AUTH_ROUTE
    ){
        composable(
            route = Screen.LoginScreen.route
        ) {
            LoginScreen(navController)
        }

        composable(
            route = Screen.SignUpScreen.route
        ) {
            SignUpScreen(navController)
        }

    }
}