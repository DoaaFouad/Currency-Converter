/*
 * Created by Doaa Fouad on 5/7/21 1:27 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:10 PM
 */

package builder

import api.FixerAPIService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import utils.RemoteConstants

class RetrofitBuilder(val okHttpBuilder: OkHttpBuilder) {

    val baseUrl =
        "${RemoteConstants.Base.FIXER_BASE_URL}/"

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .client(okHttpBuilder.okHttpClientObject)
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val fixerApiService: FixerAPIService = getRetrofit().create(FixerAPIService::class.java)
}
