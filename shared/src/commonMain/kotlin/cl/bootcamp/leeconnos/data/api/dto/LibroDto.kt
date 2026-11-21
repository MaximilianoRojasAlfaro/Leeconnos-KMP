package cl.bootcamp.leeconnos.data.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LibroDto(
    @SerialName("id")
    val id: String,
    @SerialName("isbn")
    val isbn: String,
    @SerialName("titulo")
    val titulo: String,
    @SerialName("autor")
    val autor: String,
    @SerialName("genero")
    val genero: String,
    @SerialName("subgenero")
    val subgenero: String?,
    @SerialName("categorias")
    val categorias: List<String>?,
    @SerialName("sinopsis")
    val sinopsis: String?,
    @SerialName("descripcion")
    val descripcion: String?,
    @SerialName("editorial")
    val editorial: String?,
    @SerialName("anioPublicacion")
    val anioPublicacion: Int?,
    @SerialName("formato")
    val formato: String?,
    @SerialName("estado")
    val estado: String?,
    @SerialName("precio")
    val precio: Int,
    @SerialName("precioAnterior")
    val precioAnterior: Int?,
    @SerialName("descuentoPorcentaje")
    val descuentoPorcentaje: Int?,
    @SerialName("enOferta")
    val enOferta: Boolean?,
    @SerialName("stock")
    val stock: Int?,
    @SerialName("enStock")
    val enStock: Boolean?,
    @SerialName("portadaUrl")
    val portadaUrl: String,
    @SerialName("calificacion")
    val calificacion: Double?,
    @SerialName("opiniones")
    val opiniones: Int?,
    @SerialName("ventas")
    val ventas: Int?,
    @SerialName("encuadernacion")
    val encuadernacion: String?,
    @SerialName("paginas")
    val paginas: Int?,
    @SerialName("dimensiones")
    val dimensiones: String?,
    @SerialName("etiquetas")
    val etiquetas: List<String>?,
    @SerialName("videoUrl")
    val videoUrl: String?,
    @SerialName("galeria")
    val galeria: List<String>?,
    @SerialName("fechaIngreso")
    val fechaIngreso: String?
)
