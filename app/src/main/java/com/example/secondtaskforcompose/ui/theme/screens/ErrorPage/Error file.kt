package com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.secondtaskforcompose.ui.theme.screens.ErrorPage.ErrorModel
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ErrorFile() {
    Scaffold(
        topBar = {
            TopAppBar(

                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ){
                        Text(text = "GitHub Repositories")
                    }
                }
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier.padding(paddingValues)
            ) {
                ErrorModel()
            }
        }
    )
}

@Preview
@Composable
fun out(){
    ErrorFile()
}