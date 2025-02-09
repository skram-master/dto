@file:Suppress("MatchingDeclarationName")

package com.skram_master.dto.room_settings

import com.skram_master.dto.vote_method.VoteMethodDTO
import kotlinx.serialization.Serializable

@Serializable
data class GetRoomSettingsInfoV1Response(
    val voteMethodList: List<VoteMethodDTO>,
)
