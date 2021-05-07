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

class LatestRatesViewModel :
    BaseViewModel<LatestRatesContract.Intent, LatestRatesContract.State, LatestRatesContract.Effect>() {

    override fun createInitialState(): LatestRatesContract.State {
        return LatestRatesContract.State(LatestRatesContract.LatestRatesViewState.Idle)
    }

    override suspend fun handleIntent(intent: LatestRatesContract.Intent) {
        when(intent){
            is LatestRatesContract.Intent.GetLatestRates ->{

            }
        }
    }

}