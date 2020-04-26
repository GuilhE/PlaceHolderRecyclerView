package com.github.guilhe.sample.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.github.guilhe.view.sample.databinding.LottieItemBinding

class LottieAdapter() : BaseAdapter<String, LottieItemBinding>() {

    init {
        for (i in 1..10) {
            items.add("🍯")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<LottieItemBinding> =
        ItemViewHolder(LottieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: BaseViewHolder<LottieItemBinding>, position: Int) {
        getItem(position)?.let { holder.binding.item = it }
    }

    private class ItemViewHolder(binding: LottieItemBinding) : BaseViewHolder<LottieItemBinding>(binding)
}