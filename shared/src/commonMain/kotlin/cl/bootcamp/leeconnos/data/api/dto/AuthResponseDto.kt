package cl.bootcamp.leeconnos.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AuthResponseDto(
    @SerialName("accessToken")
    val accessToken: String,
    @SerialName("tokenType")
    val tokenType: String,
    @SerialName("expiresIn")
    val expiresIn: String,
    @SerialName("refreshToken")
    val refreshToken: String,
    @SerialName("refreshExpiresIn")
    val refreshExpiresIn: String,
    @SerialName("usuario") 
    val usuario: UsuarioDto,
    @SerialName("tokenVerificacionDesarrollo")
    val tokenVerificacionDesarrollo: String?
)
