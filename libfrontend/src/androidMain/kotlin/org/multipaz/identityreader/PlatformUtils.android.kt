package org.multipaz.identityreader

import android.os.Build
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.android.Android

class AndroidPlatformUtils : PlatformUtils {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"

    override val httpClientEngineFactory: HttpClientEngineFactory<*> = Android

    override fun exitApp() {
        System.exit(0)
    }
}

actual fun getPlatformUtils(): PlatformUtils = AndroidPlatformUtils()
