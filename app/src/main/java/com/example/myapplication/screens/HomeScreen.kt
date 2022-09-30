package com.example.myapplication.screens

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.navigation.AUTH_ROUTE
import com.example.myapplication.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavController
) {


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .clickable {

                }
        )
        Text(
            text = "go to login",
            color = MaterialTheme.colors.error,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(24.dp)
                .clickable {
                    navController.navigate(AUTH_ROUTE)
                }
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