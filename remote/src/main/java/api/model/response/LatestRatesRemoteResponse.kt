/*
 * Created by Doaa Fouad on 5/7/21 1:27 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:25 PM
 */

package api.model.response

import api.model.RemoteModel
import com.google.gson.annotations.SerializedName

data class LatestRatesRemoteResponse(
    @SerializedName("success")
    var success: Boolean?,

    @SerializedName("timestamp")
    var timestamp: String?,

    @SerializedName("base")
    var base: String?,

    @SerializedName("date")
    var date: String?,

    @SerializedName("rates")
    var rates: RatesRemoteResponse?
) : RemoteModel


data class RatesRemoteResponse(
    @SerializedName("AUD")
    var aud: Double?,

    @SerializedName("USD")
    var usd: Double?,

    @SerializedName("GBP")
    var gbp: Double?

) : RemoteModel