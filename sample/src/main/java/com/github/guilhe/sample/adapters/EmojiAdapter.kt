package com.github.guilhe.sample.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.github.guilhe.view.sample.databinding.EmojiItemBinding

class EmojiAdapter(private val default: Item) : BaseAdapter<Item, EmojiItemBinding>() {

    init {
        setup()
    }

    private fun setup() {
        items.clear()
        for (i in 1..10) {
            items.add(Item(default.status))
        }
    }

    fun reset() {
        setup()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<EmojiItemBinding> =
        ItemViewHolder(EmojiItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: BaseViewHolder<EmojiItemBinding>, position: Int) {
        getItem(holder.adapterPosition)?.let {
            holder.binding.item = it
            holder.binding.root.setOnClickListener { _ ->
                it.changeStatus()
                notifyItemChanged(holder.adapterPosition)
            }
        }
    }

    private class ItemViewHolder(binding: EmojiItemBinding) : BaseViewHolder<EmojiItemBinding>(binding)
}