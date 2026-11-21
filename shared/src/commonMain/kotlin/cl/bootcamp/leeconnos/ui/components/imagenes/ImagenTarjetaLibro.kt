package cl.bootcamp.leeconnos.ui.components.imagenes

import androidx.compose.runtime.Composable

@Composable
fun ImagenTarjetaLibro(
    imagen: String,
    contentDescription: String,
    aspectRatio: Float = 1.4f
){

//    AsyncImage(
//        model = ImageRequest.Builder(LocalContext.current)
//            .data(imagen)
//            .crossfade(true)
//            .build(),
//        contentDescription = contentDescription,
//        contentScale = ContentScale.Fit,
//        modifier = Modifier
//            .fillMaxWidth()
//            .aspectRatio(aspectRatio)
//            .clip(shape = MaterialTheme.shapes.large),
//
//        placeholder = painterResource(id = R.drawable.fondo_transparente),
//        error = painterResource(id = R.drawable.fondo_transparente)
//    )
}