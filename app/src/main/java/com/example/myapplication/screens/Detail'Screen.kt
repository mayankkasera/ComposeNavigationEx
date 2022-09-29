package com.example.myapplication.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.navigation.Screen

@Composable
fun DetailScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                //used when don't have to pass data back
                //navController.popBackStack()

                //used when be have to send data back
                navController.navigate(Screen.HomeScreen.route){
                    popUpTo(Screen.HomeScreen.route){
                        inclusive = true
                    }
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Detail",
            color = MaterialTheme.colors.primary,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium
        )
    }
}


@Composable
@Preview(showBackground = true)
fun DetailScreenPrev() {
    DetailScreen(navController = rememberNavController())
}