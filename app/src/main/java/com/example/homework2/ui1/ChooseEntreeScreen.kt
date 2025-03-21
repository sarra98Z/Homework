package com.example.homework2.ui1
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ChooseEntreeScreen(navController: NavController) {
    var selectedEntree by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Choose Entree", fontSize = 20.sp)
        Spacer(Modifier.height(8.dp))

        val entrees = listOf("Mushroom Pasta", "Spicy Black Bean Skillet")
        entrees.forEach { entree ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .selectable(selected = selectedEntree == entree) {
                        selectedEntree = entree
                    }
                    .padding(8.dp)
            ) {
                RadioButton(
                    selected = selectedEntree == entree,
                    onClick = { selectedEntree = entree }
                )
                Text(entree, modifier = Modifier.padding(start = 8.dp))
            }
        }

        Spacer(Modifier.height(16.dp))
        Row {
            Button(onClick = { navController.popBackStack() }) {
                Text("Go Back")
            }
            Spacer(Modifier.width(16.dp))
            Button(onClick = { navController.navigate("chooseSide") }) {
                Text("Next")
            }
        }
    }
}