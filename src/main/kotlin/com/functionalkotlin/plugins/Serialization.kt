package com.functionalkotlin.plugins

import com.functionalkotlin.custom.Description
import com.functionalkotlin.custom.Name
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }

    routing {
        get("/json/kotlinx-serialization") {
            call.respond(mapOf("hello" to "world"))
        }
        get("/json/sealed") {
            call.respond(Name("Ostap Bender"))
        }
        get("/json/sealed-list") {
            call.respond(listOf(Name("Ostap Bender"), Description("Grossmeister")))
        }
    }
}
