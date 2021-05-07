/*
 * Created by Doaa Fouad on 5/7/21 1:28 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:28 PM
 */

package main

import api.FixerAPIService
import base.BaseRepository
import base.Mappers.latestRatesResponseMapper
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext

class CurrencyRatesRepository(val fixerAPIService: FixerAPIService) : BaseRepository(),
    ICurrencyRatesRepository {

    override suspend fun getLatestRates(baseCurrency: String): Deferred<LatestRatesItemModel> =
        withContext(dispatcherIO) {
            async {
                val latestRatesData =
                    fixerAPIService.getLatestRates(baseCurrency = baseCurrency)
                latestRatesResponseMapper.mapToItem(model = latestRatesData)
            }

        }

}