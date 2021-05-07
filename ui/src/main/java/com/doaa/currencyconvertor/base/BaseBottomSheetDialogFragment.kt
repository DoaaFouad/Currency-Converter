/*
 * Created by Doaa Fouad on 5/7/21 7:17 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 7:17 PM
 */

package com.doaa.currencyconvertor.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import base.BaseViewModel
import com.doaa.currencyconvertor.R
import com.emc.voicenote.base.ViewEffect
import com.emc.voicenote.base.ViewIntent
import com.emc.voicenote.base.ViewState
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class BaseBottomSheetDialogFragment<I : ViewIntent, S : ViewState, E : ViewEffect, V : ViewBinding> :
    BottomSheetDialogFragment() {

    abstract val viewModel: BaseViewModel<I, S, E>

    protected var binding: V? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getViewBinding(inflater, container)
        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        init()
        setListeners()
        observeViewState()
    }

    protected fun makeBottomSheetFullScreen(){
        dialog?.also {
            val bottomSheet = dialog?.findViewById<View>(R.id.design_bottom_sheet)
            bottomSheet?.layoutParams?.height = ViewGroup.LayoutParams.MATCH_PARENT
            bottomSheet?.let {
                val behavior = BottomSheetBehavior.from<View>(bottomSheet)
                behavior.peekHeight =
                    resources.displayMetrics.heightPixels
                view?.requestLayout()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        binding = null
    }

    abstract fun observeViewState()
    abstract fun getViewBinding(inflater: LayoutInflater, container: ViewGroup?): V

    open fun init() {}
    open fun setListeners() {}
}