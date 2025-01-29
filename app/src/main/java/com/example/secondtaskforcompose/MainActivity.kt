 package com.example.secondtaskforcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.secondtaskforcompose.ui.theme.SecondTaskForComposeTheme
import com.example.secondtaskforcompose.ui.theme.navigation.AppNavHost
import com.example.secondtaskforcompose.ui.theme.screens.detailsOfItem.DetailPage
import com.example.secondtaskforcompose.ui.theme.screens.loading.GitHubLikeLoadingScreen
//import com.example.secondtaskforcompose.ui.theme.screens.detailsOfItem.DetailPageCompound
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.ErrorFile
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.model.RepoDetails

 class MainActivity : ComponentActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         enableEdgeToEdge()
         setContent {
             Column(Modifier.padding(top=20.dp)) {
//                 SecondTaskForComposeTheme {
//                     AppNavHost()
//                 }
//                 DetailPage(
//                     RepoDetails(
//                     id = 1,
//                     title = "Kotlin",
//                     description = "A modern programming language for Android development.",
//                     imageRes = R.drawable.kotlin_logo,
//                     stars = 1000,
//                     ownerName = "Google"
//                 )
//                 )
                 GitHubLikeLoadingScreen()

             }
         }
     }
 }
 //            SecondTaskForComposeTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    SecondTaskForComposeTheme {
//        Greeting("Android")
//    }
//}