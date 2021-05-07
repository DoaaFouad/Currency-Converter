/*
 * Created by Doaa Fouad on 5/7/21 7:11 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 7:11 PM
 */

package com.doaa.currencyconvertor.main

import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.doaa.currencyconvertor.R
import com.doaa.currencyconvertor.base.BaseBottomSheetDialogFragment
import com.doaa.currencyconvertor.databinding.BottomsheetRateCalculationBinding
import kotlinx.coroutines.flow.collect
import main.RateItemModel
import main.rate_calculation.RateCalculationContract
import main.rate_calculation.RateCalculationViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.math.round

class BottomSheetRateCalculation(
    val targetCurrency: RateItemModel
) :
    BaseBottomSheetDialogFragment<RateCalculationContract.Intent, RateCalculationContract.State, RateCalculationContract.Effect, BottomsheetRateCalculationBinding>() {

    override val viewModel by viewModel<RateCalculationViewModel>()

    override fun observeViewState() {

        lifecycleScope.launchWhenStarted {
            viewModel.state.collect { state ->
                when (state.calculateRate) {
                    is RateCalculationContract.CalculateRate.Idle -> {
                        initCurrencyRates()
                    }
                }
            }
        }

        lifecycleScope.launchWhenStarted {
            viewModel.effect.collect { effect ->
                when (effect) {
                    is RateCalculationContract.Effect.Result -> {
                        binding?.etTargetCurrencyValue?.setText((effect.targetResult.toString()))
                    }
                }
            }
        }
    }


    private fun initCurrencyRates() {
        binding?.etTargetCurrencyValue?.setText(targetCurrency.rate.toString())

        binding?.tvBaseCurrencyName?.text = getString(R.string.currency_euro) // TODO get its value from centered default
        binding?.tvTargetCurrencyName?.text = targetCurrency.currency.name
    }

    override fun setListeners() {
        super.setListeners()

        binding?.etBaseCurrencyValue?.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
               val userBaseValue =  binding?.etBaseCurrencyValue?.text?.toString()?.toIntOrNull()
                userBaseValue?.let {
                    viewModel.setIntent(RateCalculationContract.Intent.CalculateRate(baseValue = userBaseValue, targetRate = targetCurrency.rate))
                }
            }

        })

    }

    override fun onStart() {
        super.onStart()

        makeBottomSheetFullScreen()
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): BottomsheetRateCalculationBinding {
        return BottomsheetRateCalculationBinding.inflate(inflater, container, false)
    }

}