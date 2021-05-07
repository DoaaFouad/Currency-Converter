/*
 * Created by Doaa Fouad on 5/7/21 1:28 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:28 PM
 */

package main

import kotlinx.coroutines.Deferred

interface ICurrencyRatesRepository {

    suspend fun getLatestRates(baseCurrency: String): Deferred<LatestRatesItemModel>
}