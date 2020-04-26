package com.github.guilhe.sample.adapters

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T, ViewBinding : ViewDataBinding> : RecyclerView.Adapter<BaseViewHolder<ViewBinding>>() {

    protected var items = mutableListOf<T>()

    override fun getItemCount() = items.size

    protected fun getItem(position: Int): T? {
        if (items.isNotEmpty()) {
            return items[position]
        }
        return null
    }
}

abstract class BaseViewHolder<ViewBinding : ViewDataBinding>(val binding: ViewBinding) : RecyclerView.ViewHolder(binding.root)