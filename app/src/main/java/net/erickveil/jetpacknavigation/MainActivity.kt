package net.erickveil.jetpacknavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.erickveil.jetpacknavigation.ui.theme.JetpackNavigationTheme
import net.erickveil.jetpacknavigation.ui.view.BlueScreen
import net.erickveil.jetpacknavigation.ui.view.GreenScreen
import net.erickveil.jetpacknavigation.ui.view.PinkScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Set up Navigation
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "pink") {
                composable("pink") { PinkScreen(navController = navController) }
                composable("green") { GreenScreen(navController = navController) }
                composable("blue") { BlueScreen(navController = navController) }
            }
        }
    }
}
