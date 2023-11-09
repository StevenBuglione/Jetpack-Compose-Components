package com.buglione.ui.components.appBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview


@ExperimentalMaterial3Api
@Preview
@Composable
fun SmallTopAppBarExample() {
    TopAppBar(
        title = { { /*TODO*/ }
            Text("Small Top App Bar")
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        )
    )
}

@ExperimentalMaterial3Api
@Composable
fun CenterAlignedTopAppBarExample(scrollBehavior: TopAppBarScrollBehavior){
    CenterAlignedTopAppBar(
        title = {
            Text(
                "Center Aligned Top App Bar",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis

            )
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Localized description")
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Localized description")
            }
        },
        scrollBehavior = scrollBehavior,
    )
}

@Preview
@Composable
@ExperimentalMaterial3Api
fun CenterAlignedTopAppBarExamplePreview(){
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())
    CenterAlignedTopAppBarExample(scrollBehavior)
}


@ExperimentalMaterial3Api
@Composable
fun MediumTopBarExample(scrollBehavior: TopAppBarScrollBehavior){
    MediumTopAppBar(
        title = {
            Text(
                "Medium Top App Bar",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Localized description")
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Localized description")
            }
        },
        scrollBehavior = scrollBehavior
    )
}


@Preview
@Composable
@ExperimentalMaterial3Api
fun MediumTopBarExamplePreview(){
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())
    MediumTopBarExample(scrollBehavior)
}

@ExperimentalMaterial3Api
@Composable
fun LargeTopBarExample(scrollBehavior: TopAppBarScrollBehavior){
    LargeTopAppBar(
        title = {
            Text(
                "Large Top App Bar",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Localized description")
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Localized description"
                )
            }
        },
        scrollBehavior = scrollBehavior
    )
}

@Preview
@Composable
@ExperimentalMaterial3Api
fun LargeTopBarExamplePreview(){
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())
    LargeTopBarExample(scrollBehavior)
}


@ExperimentalMaterial3Api
@Preview
@Composable
fun BottomAppBarExample(){
    BottomAppBar(
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Check, contentDescription = "Localized description")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Edit, contentDescription = "Localized description")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Call, contentDescription = "Localized description")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
            ){
                Icon(Icons.Filled.Add, contentDescription = "Localized description")
            }

        }
    )
}