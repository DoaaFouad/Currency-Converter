/*
 * Created by Doaa Fouad on 5/7/21 1:30 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:30 PM
 */

package main

import base.ItemModel

data class LatestRatesItemModel(
    val success: Boolean,
    val rates: RatesItemModel
): ItemModel

data class RatesItemModel(
    val aud: RateItemModel,
    val usd: RateItemModel,
    val gbp: RateItemModel
)