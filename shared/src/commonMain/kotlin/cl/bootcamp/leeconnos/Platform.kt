package cl.bootcamp.leeconnos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform