/*
 * Created by Doaa Fouad on 5/7/21 5:52 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 5:52 PM
 */

package main

import base.ItemModel

data class RateItemModel(
    val currency: Currency, val rate: String
): ItemModel

enum class Currency {
    AUD, GBP, USD
}