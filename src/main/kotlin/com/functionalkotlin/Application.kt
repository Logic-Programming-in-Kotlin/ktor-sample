package com.functionalkotlin

import io.ktor.server.engine.*
import io.ktor.server.cio.*
import com.functionalkotlin.plugins.*

fun main() {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureHTTP()
        configureMonitoring()
        configureSerialization()
        configureAdministration()
    }.start(wait = true)
}
