package net.erickveil.jetpacknavigation.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import androidx.compose.ui.unit.sp

@Composable
fun PinkScreen(navController: NavController) {
    ScreenLayout(
        color = Color(0xFFFFC0CE),
        screenLabel = "Pink Screen",
        navController = navController)
}

@Composable
fun GreenScreen(navController: NavController) {
    ScreenLayout(
        color = Color(0xFF00FF00),
        screenLabel = "Green Screen",
        navController = navController)
}

@Composable
fun BlueScreen(navController: NavController) {
    ScreenLayout(
        color = Color(0xFF0000FF),
        screenLabel = "Blue Screen",
        navController = navController)
}

@Composable
fun ScreenLayout(color: Color, screenLabel: String, navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color))

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = screenLabel,
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        if (screenLabel != "Pink Screen") {
            Button(
                onClick = {
                    navController.navigate("pink")
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC0CB))
            ) {
                Text("Go to Pink")
            }
        }

        if (screenLabel != "Green Screen") {
            Button(
                onClick = {
                    navController.navigate("green")
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00FF00))
            ) {
                Text("Go to Green")
            }
        }

        if (screenLabel != "Blue Screen") {
            Button(
                onClick = {
                    navController.navigate("blue")
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0000FF))
            ) {
                Text("Go to Blue")
            }
        }

        // shows the back button only if there is somewhere to go back to:
        if (navController.previousBackStackEntry != null) {
            Button(
                onClick = { navController.popBackStack() },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
            ) {
                Text("Back")
            }
        }
    }
}