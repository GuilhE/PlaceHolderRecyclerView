package com.github.guilhe.sample.adapters.placeholders

import android.view.LayoutInflater
import android.view.ViewGroup
import com.github.guilhe.sample.adapters.BaseAdapter
import com.github.guilhe.sample.adapters.BaseViewHolder
import com.github.guilhe.view.PlaceHolderAdapter
import com.github.guilhe.view.sample.databinding.PlaceholderShimmerBinding

class ShimmerPlaceHolderAdapter : BaseAdapter<Int, PlaceholderShimmerBinding>(), PlaceHolderAdapter {

    init {
        for (i in 1..20) {
            items.add(i)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<PlaceholderShimmerBinding> =
        PlaceHolderViewHolder(
            PlaceholderShimmerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: BaseViewHolder<PlaceholderShimmerBinding>, position: Int) {}

    private class PlaceHolderViewHolder(binding: PlaceholderShimmerBinding) : BaseViewHolder<PlaceholderShimmerBinding>(binding)
}