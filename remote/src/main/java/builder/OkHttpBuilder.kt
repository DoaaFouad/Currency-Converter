/*
 * Created by Doaa Fouad on 5/7/21 1:27 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:07 PM
 */

package builder

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

class OkHttpBuilder {

    private fun getOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(createLogInterceptor())
            .readTimeout(60, TimeUnit.SECONDS)
            .build()
    }

    private fun createLogInterceptor(): HttpLoggingInterceptor {
        val logInterceptor = HttpLoggingInterceptor()
        logInterceptor.level = HttpLoggingInterceptor.Level.BODY
        logInterceptor as Interceptor

        return logInterceptor
    }

    val okHttpClientObject: OkHttpClient = getOkHttpClient()
}