package cl.bootcamp.leeconnos.ui.screens.screendata

import androidx.compose.ui.graphics.Color

enum class ScreenRoutes(
    override val route: String,
    override val title: String,
    override val icon: Int,
    val selectedColor: Color? = null,
    val iconSelectedColor: Color? = null,
    override val showGlobalTopBar: Boolean = true,
    override val showBottomBar: Boolean = true
) : ScreenData {
    HOME(
        route = "inicio",
        title = "Inicio",
        icon = 0,
        showGlobalTopBar = true
    ),

    CATALOGO(
        route = "catalogo",
        title = "Catálogo",
        icon = 0,
        showGlobalTopBar = true
    ),

    DESCUBRE(
        route = "descubre",
        title = "Descubre",
        icon = 0,
        showGlobalTopBar = false
    ),

    COMUNIDAD(
        route = "comunidad",
        title = "Comunidad",
        icon = 0,
        showGlobalTopBar = false
    ),

    MI_CUENTA(
        route = "mi_cuenta",
        title = "Mi Cuenta",
        icon = 0,
        showGlobalTopBar = false
    )
}