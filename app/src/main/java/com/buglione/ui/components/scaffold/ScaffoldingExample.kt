package com.buglione.ui.components.scaffold

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp




@Preview
@Composable
fun ScaffoldExample() {
    // Remembering the state here will make sure that the state survives recompositions
    val presses = remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = { TopAppBarExample() }, // This does not depend on any changing state
        bottomBar = { BottomAppBarExample() }, // This does not depend on any changing state
        floatingActionButton = { FloatingActionButtonExample(presses) }
    ) { innerPadding ->
        // Pass only the necessary state down to prevent unnecessary recompositions
        InnerContent(innerPadding, presses.value)
    }
}

// TopAppBarExample and BottomAppBarExample don't change based on any state,
// so they will only recompose if the theme changes (which is typically less frequent)
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun TopAppBarExample(){
    TopAppBar(
        colors = topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            Text("Top app Bar")
        }
    )
}

@Composable
fun BottomAppBarExample(){
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.primary,
    ){
        Text("Bottom App Bar")
    }
}

// FloatingActionButtonExample only depends on the current state value for presses
@Composable
fun FloatingActionButtonExample(presses: MutableState<Int>) {
    // Now we are passing the MutableState directly, so only when presses changes will this recompose
    FloatingActionButton(onClick = { presses.value++ }) {
        Icon(Icons.Default.Add, contentDescription = "Add")
    }
}

// The inner content is now a separate composable which takes only the value of presses
// This is because Column and Text will only need to recompose when presses.value changes
@Composable
fun InnerContent(innerPadding: PaddingValues, presses: Int) {
    Column(
        modifier = Modifier.padding(innerPadding),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            modifier = Modifier.padding(8.dp),
            text = "This is an example of a scaffold. " +
                    "It uses the Scaffold composable's parameters to create a screen with a " +
                    "simple top app bar, bottom app bar, and floating action button.\n\n" +
                    "It also contains some basic inner content, such as this text.\n\n" +
                    "You have pressed the floating action button $presses times."
        )
    }
}
