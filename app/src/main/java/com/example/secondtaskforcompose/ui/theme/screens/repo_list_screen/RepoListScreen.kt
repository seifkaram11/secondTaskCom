package com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.components.RepoItem2
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.preview.FakeGithubRepoListUiModel
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.preview.fakeRepoList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RepoListScreen(
    onRepoClick: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Github Repositories") }

            )
        },
        content = { paddingValues ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
                    .padding(paddingValues) // Apply padding to respect the top app bar
            ) {
                items(fakeRepoList) { githubRepoUiModel ->
                    RepoItem2(
                        repo = githubRepoUiModel,
                        onRepoClick = onRepoClick
                    )
                }
            }
        }
    )
}


































/*package com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.secondtaskforcompose.ui.theme.SecondTaskForComposeTheme
//import com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.components.RepoItem2
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.preview.FakeGithubRepoUiModels
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.components.RepoItem2
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.preview.FakeGithubRepoListUiModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RepoListScreen(
    onRepoClick: () -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)
    ) {
        items(FakeGithubRepoListUiModel) { githubRepoUiModel ->
            RepoItem2(
                githubRepoUiModel = githubRepoUiModel,
                onRepoClick = onRepoClick
            )
        }
    }
}
*/