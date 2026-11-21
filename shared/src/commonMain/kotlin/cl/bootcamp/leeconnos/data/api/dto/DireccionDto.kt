package cl.bootcamp.leeconnos.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DireccionDto(
    @SerialName("id")
    val id: String,
    @SerialName("alias")
    val alias: String,
    @SerialName("nombreReceptor")
    val nombreReceptor: String,
    @SerialName("calle")
    val calle: String,
    @SerialName("comuna")
    val comuna: String,
    @SerialName("ciudad")
    val ciudad: String,
    @SerialName("region")
    val region: String,
    @SerialName("codigoPostal")
    val codigoPostal: String?,
    @SerialName("telefono")
    val telefono: String,
    @SerialName("rut")
    val rut: String?,
    @SerialName("predeterminada")
    val predeterminada: Boolean,
    @SerialName("creadoEn")
    val creadoEn: String
)

data class CrearDireccionRequestDto(
    @SerialName("alias")
    val alias: String,
    @SerialName("predeterminada")
    val predeterminada: Boolean,
    @SerialName("nombreReceptor")
    val nombreReceptor: String,
    @SerialName("calle")
    val calle: String,
    @SerialName("comuna")
    val comuna: String,
    @SerialName("ciudad")
    val ciudad: String,
    @SerialName("region")
    val region: String,
    @SerialName("codigoPostal")
    val codigoPostal: String?,
    @SerialName("telefono")
    val telefono: String,
    @SerialName("rut")
    val rut: String?
)