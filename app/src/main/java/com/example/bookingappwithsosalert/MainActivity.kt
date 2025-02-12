package com.example.bookingappwithsosalert
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bookingappwithsosalert.myviewmodels.GoogleSignInViewModel
import com.example.bookingappwithsosalert.screens.HomeScreen
import com.example.bookingappwithsosalert.screens.ProfileScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun App() {

    val navController = rememberNavController()
    val context = LocalContext.current
    val googleSignInViewModel = GoogleSignInViewModel()

    NavHost(navController = navController, startDestination = "home") {

        composable(route = "home") {
            HomeScreen {
                googleSignInViewModel.handleGoogleSignIn(context,navController)
            }
        }

        composable(route = "profile") {
            ProfileScreen(googleSignInViewModel)
        }

    }

}