package shinobi9.shuriken.extensions

import io.ktor.application.*
import io.ktor.config.*
import io.ktor.util.*


@OptIn(KtorExperimentalAPI::class)
fun Application.conf(key: String): ApplicationConfigValue? = environment.config.propertyOrNull(key)

@OptIn(KtorExperimentalAPI::class)
fun Application.profile() = conf("ktor.deployment.profile")?.getString() ?: "debug"

@OptIn(KtorExperimentalAPI::class)
fun Application.domain() = conf("ktor.deployment.domain")?.getString() ?: "127.0.0.1"


fun Application.isDebug() = profile() == "debug"
fun Application.isProduction() = profile() == "prod"