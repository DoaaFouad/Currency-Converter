/*
 * Created by Doaa Fouad on 5/7/21 1:38 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:38 PM
 */

package main

import api.model.response.LatestRatesRemoteResponse
import base.ItemMapper

class LatestRatesResponseMapper :
    ItemMapper<LatestRatesRemoteResponse?, LatestRatesItemModel> {
    override fun mapFromItem(model: LatestRatesItemModel): LatestRatesRemoteResponse {
        throw UnsupportedOperationException()
    }

    override fun mapToItem(model: LatestRatesRemoteResponse?): LatestRatesItemModel {
        return LatestRatesItemModel(
            success = model?.success ?: false,
            rates = RatesItemModel(
                aud = RateItemModel(Currency.AUD, model?.rates?.aud ?: 0.0),
                usd = RateItemModel(Currency.USD, model?.rates?.usd ?: 0.0),
                gbp = RateItemModel(Currency.GBP, model?.rates?.gbp ?: 0.0)
            )
        )
    }
}