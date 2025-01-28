package com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.model

data class RepoItemUiModel(
    val id: Int,
    val name: String,
    val avatarUrl: String,
    val description: String,
    val stars: Int,
    val ownerName: String
)
