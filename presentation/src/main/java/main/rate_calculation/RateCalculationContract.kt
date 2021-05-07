/*
 * Created by Doaa Fouad on 5/7/21 7:13 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 7:13 PM
 */

package main.rate_calculation

import com.emc.voicenote.base.ViewEffect
import com.emc.voicenote.base.ViewIntent
import com.emc.voicenote.base.ViewState

class RateCalculationContract {

    sealed class Intent : ViewIntent {
        data class CalculateRate(val baseValue: Int, val targetRate: Double) : Intent()
    }

    data class State(
        val calculateRate: CalculateRate
    ) : ViewState

    sealed class CalculateRate {
        object Idle : CalculateRate()
    }

    sealed class Effect : ViewEffect {
        data class Result(val targetResult: Double) : Effect()
    }
}