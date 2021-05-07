/*
 * Created by Doaa Fouad on 5/7/21 7:12 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 7:12 PM
 */

package main.rate_calculation

import base.BaseViewModel

class RateCalculationViewModel :
    BaseViewModel<RateCalculationContract.Intent, RateCalculationContract.State, RateCalculationContract.Effect>() {

    override fun createInitialState(): RateCalculationContract.State {
        return RateCalculationContract.State(RateCalculationContract.CalculateRate.Idle)
    }

    override suspend fun handleIntent(intent: RateCalculationContract.Intent) {
        when (intent) {
            is RateCalculationContract.Intent.CalculateRate -> {
                setEffect {
                    RateCalculationContract.Effect.Result(
                        calculateRate(
                            baseValue = intent.baseValue,
                            rate = intent.targetRate
                        )
                    )
                }
            }
        }
    }

    // TODO unit test
    private fun calculateRate(baseValue: Int, rate: Double): Double {
        return baseValue.times(rate)
    }

}