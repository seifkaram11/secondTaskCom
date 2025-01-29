package com.example.secondtaskforcompose.ui.theme.screens.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun GitHubLikeLoadingScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        RepositoryItemSkeleton()
        ShimmerEffect()
    }
}