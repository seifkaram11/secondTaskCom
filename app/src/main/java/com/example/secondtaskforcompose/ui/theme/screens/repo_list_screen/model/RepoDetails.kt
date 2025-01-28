package com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.model

import androidx.annotation.DrawableRes

data class RepoDetails(
    val id: Int,
    val title: String,
    val description: String,
    @DrawableRes val imageRes: Int ,
    val stars: Int,
    val ownerName: String // Local resource ID
)
