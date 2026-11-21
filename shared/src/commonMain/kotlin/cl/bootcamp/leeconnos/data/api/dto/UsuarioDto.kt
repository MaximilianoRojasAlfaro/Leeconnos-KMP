package cl.bootcamp.leeconnos.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UsuarioDto(
    @SerialName("id")
    val id: String,
    @SerialName("nombre")
    val nombre: String,
    @SerialName("apellido")
    val apellido: String,
    @SerialName("nombreCompleto")
    val nombreCompleto: String,
    @SerialName("email")
    val email: String,
    @SerialName("rol")
    val rol: String,
    @SerialName("generosFavoritos")
    val generosFavoritos: List<String>,
    @SerialName("avatarUrl")
    val avatarUrl: String?,
    @SerialName("recibirNovedades")
    val recibirNovedades: Boolean,
    @SerialName("emailVerificado")
    val emailVerificado: Boolean,
    @SerialName("proveedorAuth")
    val proveedorAuth: String,
    @SerialName("tieneContrasena")
    val tieneContrasena: Boolean,
    @SerialName("fechaRegistro")
    val fechaRegistro: String,
    @SerialName("creadoEn")
    val creadoEn: String
)
