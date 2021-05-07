/*
 * Created by Doaa Fouad on 5/7/21 2:00 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 2:00 PM
 */

package com.doaa.currencyconvertor.main

import com.doaa.currencyconvertor.base.BaseActivity
import com.doaa.currencyconvertor.databinding.ActivityLatestRatesBinding
import main.latest_rates.LatestRatesContract
import main.latest_rates.LatestRatesViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class LatestRatesActivity :
    BaseActivity<LatestRatesContract.Intent, LatestRatesContract.State, LatestRatesContract.Effect, ActivityLatestRatesBinding>() {

    override val viewModel by viewModel<LatestRatesViewModel>()

    override fun render() {
    }

    override fun init() {
        super.init()

        viewModel.setIntent(LatestRatesContract.Intent.GetLatestRates)
    }

    override fun getViewBinding(): ActivityLatestRatesBinding {
        return ActivityLatestRatesBinding.inflate(layoutInflater)
    }
}