package com.example.myapplication.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                navController.navigate(route = Screen.DetailScreen.route)
            },
        contentAlignment = Alignment.Center
    ){
         Text(
             text = "Home",
             color = MaterialTheme.colors.primary,
             fontSize = 24.sp,
             fontWeight = FontWeight.Medium
         )
    }
}


@Composable
@Preview(showBackground = true)
fun HomeScreenPrev() {
    HomeScreen(
        navController = rememberNavController()
    )
}