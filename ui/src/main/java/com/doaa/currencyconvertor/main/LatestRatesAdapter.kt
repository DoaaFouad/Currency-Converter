/*
 * Created by Doaa Fouad on 5/7/21 5:23 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 5:23 PM
 */

package com.doaa.currencyconvertor.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.doaa.currencyconvertor.databinding.RowLatestRateBinding
import main.RateItemModel

class LatestRatesAdapter(val latestRatesListener: LatestRatesListener) :
    RecyclerView.Adapter<LatestRatesViewHolder>() {

    private var ratesList: MutableList<RateItemModel> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestRatesViewHolder {
        val itemBinding =
            RowLatestRateBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LatestRatesViewHolder(itemBinding, latestRatesListener)
    }

    override fun getItemCount(): Int {
        return ratesList.size
    }

    override fun onBindViewHolder(holder: LatestRatesViewHolder, position: Int) {
        return holder.initRow(ratesList[position])
    }

    fun setData(rates: List<RateItemModel>?) {
        rates?.let {
            ratesList.addAll(rates)
        }
        notifyDataSetChanged()
    }

}