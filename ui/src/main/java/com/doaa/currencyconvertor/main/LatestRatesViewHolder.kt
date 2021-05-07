/*
 * Created by Doaa Fouad on 5/7/21 5:23 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 5:23 PM
 */

package com.doaa.currencyconvertor.main

import androidx.recyclerview.widget.RecyclerView
import com.doaa.currencyconvertor.R
import com.doaa.currencyconvertor.databinding.RowLatestRateBinding
import main.Currency
import main.RateItemModel

class LatestRatesViewHolder(
    val rowLatestRateBinding: RowLatestRateBinding,
    val latestRateListener: LatestRateListener
) :
    RecyclerView.ViewHolder(rowLatestRateBinding.root) {

    fun initRow(model: RateItemModel) {
        rowLatestRateBinding.tvCurrencyName.text = model.currency.name
        rowLatestRateBinding.tvCurrencyRate.text = model.rate

        val icon = currencyDrawableResource(model.currency)
        icon?.let {
            rowLatestRateBinding.ivCurrency.setImageResource(icon)
        }
    }

    private fun currencyDrawableResource(currency: Currency): Int? {
        return when (currency) {
            Currency.USD -> {
                R.drawable.ic_us
            }

            Currency.GBP -> {
                R.drawable.ic_uk
            }

            Currency.AUD -> {
                R.drawable.ic_australia
            }
        }
    }
}