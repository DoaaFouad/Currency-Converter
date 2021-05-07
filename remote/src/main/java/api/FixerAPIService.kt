/*
 * Created by Doaa Fouad on 5/7/21 1:27 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:25 PM
 */

package api

import api.model.response.LatestRatesRemoteResponse
import retrofit2.http.GET
import retrofit2.http.Query
import utils.RemoteConstants

interface FixerAPIService {

    @GET(RemoteConstants.Endpoints.LATEST)
    suspend fun getLatestRates(
        @Query("access_key") accessKey: String = RemoteConstants.Base.FIXER_ACCESS_KEY,
        @Query("base") baseCurrency: String
    ): LatestRatesRemoteResponse
}