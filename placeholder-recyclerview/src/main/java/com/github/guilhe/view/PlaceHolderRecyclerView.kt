package com.github.guilhe.view

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.RecyclerView

@Suppress("UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")
class PlaceHolderRecyclerView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : RecyclerView(context, attrs, defStyleAttr) {

    private lateinit var itemAdapter: Adapter<ViewHolder>
    lateinit var holdersAdapter: PlaceHolderAdapter

    override fun setAdapter(adapter: Adapter<*>?) {
        super.setAdapter(adapter)
        if (adapter !is PlaceHolderAdapter) {
            itemAdapter = adapter as Adapter<ViewHolder>
        }
    }

    fun toggleHoldersAdapter(show: Boolean) {
        if (::holdersAdapter.isInitialized) {
            adapter = if (show) holdersAdapter as Adapter<ViewHolder> else itemAdapter
        }
    }

    fun isHoldersAdapterVisible() = ::holdersAdapter.isInitialized && adapter == holdersAdapter
}

interface PlaceHolderAdapter