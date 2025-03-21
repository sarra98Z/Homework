package com.example.homework2.ui1

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.homework2.ui1.CheckoutScreen
import com.example.homework2.ui1.ChooseSideScreen
import com.example.homework2.ui1.ChooseEntreeScreen
import com.example.homework2.ui1.HomeScreen



@Composable
fun LunchTrayApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("chooseEntree") { ChooseEntreeScreen(navController) }
        composable("chooseSide") { ChooseSideScreen(navController) }
        composable("checkout") { CheckoutScreen(navController) }
    }
}
