@file:OptIn(ExperimentalMaterial3Api::class)

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DynamicToolbarExample(navController: NavController, screenType: String) {
    var showMenu by remember { mutableStateOf(false) }

    // Customize the toolbar based on the screen type
    val toolbarTitle = when (screenType) {
        "repo_details_screen" -> "repo_details_screen"
        "repo_list_screen" -> "repo_list_screen"
        else -> "Default"
    }

    val toolbarActions = when (screenType) {
        "Home" -> listOf(
            ToolbarAction(
                icon = Icons.Default.Search,
                description = "Search",
                onClick = { /* Handle search click */ }
            ),
            ToolbarAction(
                icon = Icons.Default.Favorite,
                description = "Favorite",
                onClick = { /* Handle favorite click */ }
            )
        )
        "Settings" -> listOf(
            ToolbarAction(
                icon = Icons.Default.Settings,
                description = "Settings",
                onClick = { /* Handle settings click */ }
            )
        )
        else -> emptyList()
    }

    val dropdownMenu: @Composable (() -> Unit)? = when (screenType) {
        "Home" -> {
            {
                IconButton(onClick = { showMenu = !showMenu }) {
                    Icon(Icons.Default.MoreVert, contentDescription = "More")
                }
                DropdownMenu(
                    expanded = showMenu,
                    onDismissRequest = { showMenu = false }
                ) {
                    DropdownMenuItem(
                        text = { Text("Option 1") },
                        onClick = { /* Handle option 1 click */ }
                    )
                    DropdownMenuItem(
                        text = { Text("Option 2") },
                        onClick = { /* Handle option 2 click */ }
                    )
                }
            }
        }
        else -> null
    }

    Scaffold(
        topBar = {
            CustomToolbar(
                title = toolbarTitle,
                navigationIcon = Icons.AutoMirrored.Filled.ArrowBack,
                onNavigationClick = { navController.popBackStack() },
                actions = toolbarActions,
                dropdownMenu = dropdownMenu
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text("$toolbarTitle Screen!")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomToolbar(
    title: String,
    navigationIcon: ImageVector? = null,
    onNavigationClick: () -> Unit = {},
    actions: List<ToolbarAction> = emptyList(),
    dropdownMenu: (@Composable () -> Unit)? = null // Mark as @Composable
) {
    TopAppBar(
        title = { Text(title) },
        navigationIcon = {
            if (navigationIcon != null) {
                IconButton(onClick = onNavigationClick) {
                    Icon(navigationIcon, contentDescription = "Navigation Icon")
                }
            }
        },
        actions = {
            Row {
                actions.forEach { action ->
                    IconButton(onClick = action.onClick) {
                        Icon(action.icon, contentDescription = action.description)
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Add spacing between icons
                }
                dropdownMenu?.invoke() // Render the dropdown menu if provided
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
            actionIconContentColor = MaterialTheme.colorScheme.primary
        )
    )
}

data class ToolbarAction(
    val icon: ImageVector,
    val description: String,
    val onClick: () -> Unit
)