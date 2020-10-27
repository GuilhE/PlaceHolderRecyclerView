package com.github.guilhe.sample.adapters.placeholders

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.github.guilhe.sample.adapters.BaseAdapter
import com.github.guilhe.sample.adapters.BaseViewHolder
import com.github.guilhe.views.PlaceHolderAdapter
import com.github.guilhe.views.sample.R
import com.github.guilhe.views.sample.databinding.PlaceholderRotationBinding

class RotationPlaceHolderAdapter : BaseAdapter<Int, PlaceholderRotationBinding>(), PlaceHolderAdapter {

    init {
        for(i in 1..10){
            items.add(i)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<PlaceholderRotationBinding> =
        PlaceHolderViewHolder(PlaceholderRotationBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: BaseViewHolder<PlaceholderRotationBinding>, position: Int) {
        with(holder.binding.root) { startAnimation(AnimationUtils.loadAnimation(this.context, R.anim.anim_rotation)) }
    }

    private class PlaceHolderViewHolder(binding: PlaceholderRotationBinding) : BaseViewHolder<PlaceholderRotationBinding>(binding)
}