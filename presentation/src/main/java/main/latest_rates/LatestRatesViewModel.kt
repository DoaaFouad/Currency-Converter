/*
 * Created by Doaa Fouad on 5/7/21 1:56 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:56 PM
 */

package main.latest_rates

import base.BaseViewModel
import main.CurrencyRatesRepository

class LatestRatesViewModel(val currencyRatesRepository: CurrencyRatesRepository) :
    BaseViewModel<LatestRatesContract.Intent, LatestRatesContract.State, LatestRatesContract.Effect>() {

    private val DEFAULT_BASE_CURRENCY = "EUR"

    override fun createInitialState(): LatestRatesContract.State {
        return LatestRatesContract.State(LatestRatesContract.LatestRatesViewState.Idle)
    }

    override suspend fun handleIntent(intent: LatestRatesContract.Intent) {
        when (intent) {
            is LatestRatesContract.Intent.GetLatestRates -> {
                getLatestRates()
            }
        }
    }

    private suspend fun getLatestRates() {
        try {
            val response =
                currencyRatesRepository.getLatestRates(baseCurrency = DEFAULT_BASE_CURRENCY).await()

        } catch (e: Exception) {
            setEffect { LatestRatesContract.Effect.ShowServerErrorToast }
        }
    }

}