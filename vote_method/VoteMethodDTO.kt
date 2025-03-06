package com.skram_master.dto.vote_method

import com.skram_master.enums.vote_method.VoteMethodType
import kotlinx.serialization.Serializable

@Serializable
data class VoteMethodDTO(
    val type: VoteMethodType,
    val options: List<String>,
)
