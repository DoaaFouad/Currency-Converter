/*
 * Created by Doaa Fouad on 5/7/21 2:19 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 2:19 PM
 */

package com.doaa.currencyconvertor.base.di

import builder.OkHttpBuilder
import builder.RetrofitBuilder
import main.CurrencyRatesRepository
import main.latest_rates.LatestRatesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { LatestRatesViewModel(get()) }
}

val repositoryModule = module {
    single { CurrencyRatesRepository(get()) }
}

val apiModule = module {
    single { RetrofitBuilder(get()).fixerApiService }
    single { OkHttpBuilder() }
}