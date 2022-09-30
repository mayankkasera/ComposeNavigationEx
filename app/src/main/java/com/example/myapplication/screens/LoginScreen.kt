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
import com.example.myapplication.navigation.HOME_ROUTE
import com.example.myapplication.navigation.Screen


@Composable
fun LoginScreen(
    navController: NavController
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Login",
            color = MaterialTheme.colors.primary,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .clickable {
                    navController.navigate(Screen.SignUpScreen.route)
                }
        )
        Text(
            text = "go back",
            color = MaterialTheme.colors.error,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(24.dp)
                .clickable {
                    navController.navigate(HOME_ROUTE){
                        popUpTo(HOME_ROUTE){
                           inclusive = true
                        }
                    }
                }
        )

        Text(
            text = "go to detail",
            color = MaterialTheme.colors.error,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(24.dp)
                .clickable {
                    navController.popBackStack()
                    navController.navigate(Screen.DetailScreen.setArgs(2,"dcds"))
                }
        )
    }


}


@Composable
@Preview(showBackground = true)
fun LoginScreenPrev() {
    LoginScreen(
        navController = rememberNavController()
    )
}