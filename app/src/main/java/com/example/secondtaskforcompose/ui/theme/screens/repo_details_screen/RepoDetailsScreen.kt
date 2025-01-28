package com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.components.RepoDetails
import com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.preview.getMockRepositories

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RepoDetailScreen(
    s: String,
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Issues") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back" // Accessibility description
                        )
                    }
                }
            )
        },
        content = { paddingValues ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
                    .padding(paddingValues) // Apply padding to respect the top app bar
            ) {
                items(getMockRepositories) { modeldetails ->
                    RepoDetails(
                        modifier = Modifier.padding(10.dp),
                        modeldetails = modeldetails
                    )
                }
            }
        }
    )
}




























/*package com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.components.RepoDetails
import com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.preview.getMockRepositories
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.components.RepoItem2
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.preview.FakeGithubRepoListUiModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun RepoDetailScreen(
    s:String
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)
    ) {
        items(getMockRepositories) { modeldetails ->
            RepoDetails(
               modifier= Modifier.padding(10.dp),
                modeldetails= modeldetails
            )
        }
    }
}*/