package com.example.secondtaskforcompose.ui.theme.screens.detailsOfItem.model

import androidx.annotation.DrawableRes

data class ModelDetails_(
    val id: Int,
    val title: String,
    val description: String,
    @DrawableRes val imageRes: Int,
    val stars: Int,
    val value:Int
)
