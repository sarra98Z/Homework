package com.example.homework2.ui1
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.unit.sp

@Composable
fun CheckoutScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Order Summary", fontSize = 20.sp)
        Spacer(Modifier.height(8.dp))

        // Example summary details
        Text("Entree: Mushroom Pasta - $7.00")
        Text("Side: Summer Salad - $3.50")
        Text("Total: $10.50")

        Spacer(Modifier.height(16.dp))
        Row {
            Button(onClick = { navController.popBackStack() }) {
                Text("Go Back") // Renamed from "Cancel" to "Go Back"
            }
            Spacer(Modifier.width(16.dp))
            Button(onClick = { /* Submit Order */ }) {
                Text("Submit")
            }
        }
    }
}
