/*
 * Created by Doaa Fouad on 5/7/21 1:56 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:56 PM
 */

package main.latest_rates

import com.emc.voicenote.base.ViewEffect
import com.emc.voicenote.base.ViewIntent
import com.emc.voicenote.base.ViewState
import main.RateItemModel

class LatestRatesContract {
    sealed class Intent : ViewIntent {
        object GetLatestRates : Intent()
    }

    data class State(
        val latestRatesViewState: LatestRatesViewState
    ) : ViewState

    sealed class LatestRatesViewState {
        object Idle : LatestRatesViewState()
        object Loading : LatestRatesViewState()
        data class Success(val latestRates: List<RateItemModel>) : LatestRatesViewState()
    }

    sealed class Effect : ViewEffect {
        object ShowServerErrorToast : Effect()
    }
}