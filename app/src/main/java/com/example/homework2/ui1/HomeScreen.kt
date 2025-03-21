package com.example.homework2.ui1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Lunch Tray", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("chooseEntree") }) {
            Text("Start Order")
        }
    }
}
