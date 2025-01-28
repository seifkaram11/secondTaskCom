package com.example.secondtaskforcompose.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.secondtaskforcompose.ui.theme.screens.repo_details_screen.RepoDetailScreen
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.RepoListScreen
@Composable
fun AppNavHost(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
//        startDestination = "repo_list_screen"//start destination(the first screen) the string you can named any thing you want
        startDestination =Screens.RepoListScreen.route
    ){
        //the graph
        //the destinations(the first screen)
       composable(
//           route="repo_list_screen"
           route=Screens.RepoListScreen.route
       ) {
           RepoListScreen(
               onRepoClick =
               { navController.navigate(
//                   "repo_details_screen"
                   Screens.RepoDetailsScreen.passUserId("12")
                 )
               }
           )

       }
        //another destination(the second screen)
       composable(
//           route="repo_details_screen"
           route=Screens.RepoDetailsScreen.route,
           arguments = listOf(navArgument(USER_ID_KEY){type= NavType.StringType})
       ){navBackStackEntry->
           val id=navBackStackEntry.arguments?.getString(USER_ID_KEY)
           id?.let {
               RepoDetailScreen(
                   it,
                   onBackClick = { navController.popBackStack() }
               )
           }
       }
    }
}
/*
* Host
* destinations
* routes
* graph
* navController
* */