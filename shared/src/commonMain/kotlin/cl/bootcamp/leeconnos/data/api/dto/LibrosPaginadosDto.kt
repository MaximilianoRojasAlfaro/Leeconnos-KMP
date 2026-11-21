package cl.bootcamp.leeconnos.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LibrosPaginadosDto(
    @SerialName("items")
    val items: List<LibroDto>,
    @SerialName("total")
    val total: Int,
    @SerialName("page")
    val page: Int,
    @SerialName("limit")
    val limit: Int,
    @SerialName("totalPages")
    val totalPages: Int
)
