package com.github.guilhe.sample.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.github.guilhe.view.sample.databinding.MahjongItemBinding

class MahjongItemAdapter : BaseAdapter<Item, MahjongItemBinding>() {

    init {
        items.addAll(
            listOf(
                Item("🀀"),Item("🀁"),Item("🀂"),Item("🀃"),
                Item("🀢"),Item("🀣"),Item("🀤"),Item("🀥"),
                Item("🀦"),Item("🀧"),Item("🀨"),Item("🀩"),
                Item("🀅"),Item("🀆"),Item("🀄︎"),Item(""),
                Item("🀐"),Item("🀙"),Item("🀇")
            )
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<MahjongItemBinding> =
        ItemViewHolder(MahjongItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: BaseViewHolder<MahjongItemBinding>, position: Int) {
        getItem(holder.adapterPosition)?.let { holder.binding.item = it }
    }

    private class ItemViewHolder(binding: MahjongItemBinding) : BaseViewHolder<MahjongItemBinding>(binding)
}