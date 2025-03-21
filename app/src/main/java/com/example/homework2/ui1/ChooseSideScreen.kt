package com.example.homework2.ui1
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.unit.sp

@Composable
fun ChooseSideScreen(navController: NavController) {
    var selectedSide by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Choose Side", fontSize = 20.sp)
        Spacer(Modifier.height(8.dp))

        val sides = listOf("Summer Salad", "Butternut Squash Soup")
        sides.forEach { side ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .selectable(selected = selectedSide == side) {
                        selectedSide = side
                    }
                    .padding(8.dp)
            ) {
                RadioButton(
                    selected = selectedSide == side,
                    onClick = { selectedSide = side }
                )
                Text(side, modifier = Modifier.padding(start = 8.dp))
            }
        }

        Spacer(Modifier.height(16.dp))
        Row {
            Button(onClick = { navController.popBackStack() }) {
                Text("Go Back")
            }
            Spacer(Modifier.width(16.dp))
            Button(onClick = { navController.navigate("chooseAccompaniment") }) {
                Text("Next")
            }
        }
    }
}
