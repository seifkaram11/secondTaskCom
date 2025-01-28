package com.example.secondtaskforcompose.ui.theme.screens.detailsOfItem
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImagePainter.State.Empty.painter
import coil.fetch.SourceResult
import com.example.secondtaskforcompose.R
import com.example.secondtaskforcompose.ui.theme.Yellow
import com.example.secondtaskforcompose.ui.theme.screens.detailsOfItem.componets.DetailPageCompound
import com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.components.RepoDetails
import com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.preview.getMockRepositories
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.model.RepoDetails

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailPage(
    value_: RepoDetails) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Issues") },
                navigationIcon = {
                    IconButton(onClick ={

                    }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back" // Accessibility description
                        )
                    }
                }
            )
        },
        content = { paddingValues ->
            Column(
                Modifier
                    .padding(paddingValues)
            ) {
                DetailPageCompound(
                    value = value_
                )
            }
        }
    )
}




@Preview(
    showSystemUi = true,
    showBackground = false
)
@Composable
fun out(){
    DetailPageCompound(
        value = RepoDetails(
            id = 1,
            title = "Kotlin",
            description = "A modern programming language for Android development.",
            imageRes = R.drawable.kotlin_logo,
            stars = 1000,
            ownerName = "Google"
        )
    )
}












