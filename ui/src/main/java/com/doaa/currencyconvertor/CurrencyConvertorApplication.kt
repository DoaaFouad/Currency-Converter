/*
 * Created by Doaa Fouad on 5/7/21 2:21 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 2:21 PM
 */

package com.doaa.currencyconvertor

import android.app.Application
import com.doaa.currencyconvertor.base.di.apiModule
import com.doaa.currencyconvertor.base.di.repositoryModule
import com.doaa.currencyconvertor.base.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class CurrencyConvertorApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin()
    }

    private fun startKoin() {
        org.koin.core.context.startKoin {
            androidLogger()
            androidContext(this@CurrencyConvertorApplication)
            modules(listOf(viewModelModule, repositoryModule, apiModule))
        }
    }

}