package org.multipaz.identityreader

import io.ktor.client.engine.HttpClientEngineFactory

interface PlatformUtils {
    val name: String

    val httpClientEngineFactory: HttpClientEngineFactory<*>

    fun exitApp()
}

expect fun getPlatformUtils(): PlatformUtils
