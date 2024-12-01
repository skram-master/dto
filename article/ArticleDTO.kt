package com.skram_master.dto.article

import kotlinx.serialization.Serializable

@Serializable
data class ArticlePostV1Request(
    val title: String,
    val content: String,
)

@Serializable
data class ArticleV1Response(
    val id: Int,
    val title: String,
    val content: String,
)
