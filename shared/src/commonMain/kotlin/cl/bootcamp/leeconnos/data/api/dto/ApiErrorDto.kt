package cl.bootcamp.leeconnos.data.api.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiErrorDto(
    @SerialName("statusCode")
    val statusCode: Int? = null,
    @SerialName("error")
    val error: String? = null,
    @SerialName("message")
    val message: String? = null,
    @SerialName("detalles")
    val detalles: List<String>? = null,
    @SerialName("requestId")
    val requestId: String? = null,
    @SerialName("timestamp")
    val timestamp: String? = null,
    @SerialName("path")
    val path: String? = null
)