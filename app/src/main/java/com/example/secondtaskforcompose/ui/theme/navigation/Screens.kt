package com.example.secondtaskforcompose.ui.theme.navigation

const val USER_ID_KEY = "id"
sealed class Screens(val route: String) {

//     data class RepoListScreen(val route: String="repo_list_screen") : Screens()//==>Screens.RepoListScreen().route
//     data class RepoDetailsScreen(val route: String="repo_details_screen") : Screens()//==>Screens.RepoDetailsScreen().route
    data object RepoListScreen : Screens(route="repo_list_screen")
    data object RepoDetailsScreen : Screens(route="repo_details_screen/{$USER_ID_KEY}"){
        fun passUserId(id:String):String{
            return "repo_details_screen/$id"
        }
    }
}