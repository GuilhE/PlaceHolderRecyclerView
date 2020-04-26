package com.github.guilhe.sample.adapters.placeholders

import android.view.LayoutInflater
import android.view.ViewGroup
import com.github.guilhe.sample.adapters.BaseAdapter
import com.github.guilhe.sample.adapters.BaseViewHolder
import com.github.guilhe.view.PlaceHolderAdapter
import com.github.guilhe.view.sample.databinding.PlaceholderLottieBinding

class LottiePlaceHolderAdapter : BaseAdapter<Int, PlaceholderLottieBinding>(), PlaceHolderAdapter {

    init {
        for (i in 1..10) {
            items.add(i)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<PlaceholderLottieBinding> =
        PlaceHolderViewHolder(PlaceholderLottieBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: BaseViewHolder<PlaceholderLottieBinding>, position: Int) {}

    private class PlaceHolderViewHolder(binding: PlaceholderLottieBinding) : BaseViewHolder<PlaceholderLottieBinding>(binding)
}