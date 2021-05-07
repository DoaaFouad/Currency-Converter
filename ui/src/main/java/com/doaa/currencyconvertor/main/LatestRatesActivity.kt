/*
 * Created by Doaa Fouad on 5/7/21 2:00 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 2:00 PM
 */

package com.doaa.currencyconvertor.main

import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.doaa.currencyconvertor.base.BaseActivity
import com.doaa.currencyconvertor.databinding.ActivityLatestRatesBinding
import kotlinx.coroutines.flow.collect
import main.RateItemModel
import main.latest_rates.LatestRatesContract
import main.latest_rates.LatestRatesViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class LatestRatesActivity :
    BaseActivity<LatestRatesContract.Intent, LatestRatesContract.State, LatestRatesContract.Effect, ActivityLatestRatesBinding>(),
    LatestRateListener {

    override val viewModel by viewModel<LatestRatesViewModel>()

    private val latestRatesAdapter by lazy { LatestRatesAdapter(this) }

    override fun observeViewState() {
        lifecycleScope.launchWhenStarted {
            viewModel.state.collect {
                when (val stateView = it.latestRatesViewState) {
                    is LatestRatesContract.LatestRatesViewState.Idle -> {
                    }
                    is LatestRatesContract.LatestRatesViewState.Loading -> {
                    }
                    is LatestRatesContract.LatestRatesViewState.Success -> {
                        populateData(stateView.latestRates)
                    }
                }
            }
        }

    }

    override fun init() {
        super.init()

        initRecyclerviewer()
        viewModel.setIntent(LatestRatesContract.Intent.GetLatestRates)
    }

    private fun initRecyclerviewer() {
        val layoutManager = LinearLayoutManager(this)
        binding?.rvRates?.layoutManager = layoutManager
        binding?.rvRates?.adapter = latestRatesAdapter
    }

    private fun populateData(latestRates: List<RateItemModel>?) {
        latestRatesAdapter.setData(latestRates)
    }

    override fun onRateClick(rate: String) {

    }

    override fun getViewBinding(): ActivityLatestRatesBinding {
        return ActivityLatestRatesBinding.inflate(layoutInflater)
    }
}