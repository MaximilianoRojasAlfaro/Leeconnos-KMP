package cl.bootcamp.leeconnos.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RegistroRequestDto(
    @SerialName("nombre")
    val nombre: String,
    @SerialName("apellido")
    val apellido: String,
    @SerialName("email")
    val email: String,
    @SerialName("password")
    val contrasena: String,
    @SerialName("rol")
    val rol: String = "CLIENTE",
    @SerialName("generosFavoritos")
    val generosFavoritos: List<String> = emptyList(),
    @SerialName("avatarUrl")
    val avatarUrl: String? = null,
    @SerialName("recibirNovedades")
    val recibirNovedades: Boolean
)
