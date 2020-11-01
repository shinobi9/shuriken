package shinobi9.shuriken.routers

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

class BotRouter(private val routing: Routing) {
    fun routers() = routing.route("/bot") {
        get("/{id}") {
            val id = call.parameters["id"]!!.toIntOrNull() ?: error("should be number")
            call.respond(mapOf("hello" to id))
        }
        delete("/{id}") {

        }
    }
}