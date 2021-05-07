/*
 * Created by Doaa Fouad on 5/7/21 2:00 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 2:00 PM
 */

package com.doaa.currencyconvertor.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import base.BaseViewModel
import com.emc.voicenote.base.ViewEffect
import com.emc.voicenote.base.ViewIntent
import com.emc.voicenote.base.ViewState

abstract class BaseActivity<I : ViewIntent, S : ViewState, E : ViewEffect, V : ViewBinding> :
    AppCompatActivity() {

    abstract val viewModel: BaseViewModel<I, S, E>

    protected var binding: V? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = getViewBinding()
        setContentView(binding?.root)
        render()
        init()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    abstract fun render()
    abstract fun getViewBinding(): V

    open fun init() {}
}