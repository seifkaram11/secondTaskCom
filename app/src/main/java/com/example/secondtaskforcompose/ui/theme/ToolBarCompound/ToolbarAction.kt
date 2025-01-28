package com.example.secondtaskforcompose.ui.theme.ToolBarCompound

import androidx.compose.ui.graphics.vector.ImageVector

data class ToolbarAction(
    val icon: ImageVector,
    val description: String,
    val onClick: () -> Unit
)