package za.ac.cput

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import za.ac.cput.screens.Courses
import za.ac.cput.screens.Start
import za.ac.cput.screens.Journey

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen()
{
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Navigation.Start.route,
    ) {
        composable(Navigation.Start.route) {
            Start(navController = navController)
        }

        composable(Navigation.Journey.route) {
            Journey(navController = navController)
        }

        composable(Navigation.Courses.route){
            Courses(navController = navController)
        }
    }
}