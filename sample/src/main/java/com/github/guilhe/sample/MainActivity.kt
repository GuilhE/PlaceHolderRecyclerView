package com.github.guilhe.sample

import android.content.res.Resources
import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.transition.TransitionManager
import com.github.guilhe.sample.adapters.*
import com.github.guilhe.sample.adapters.decorators.MarginItemDecoration
import com.github.guilhe.sample.adapters.placeholders.*
import com.github.guilhe.views.sample.R
import com.github.guilhe.views.sample.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var loading = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        with(binding.mahjongPlaceHolderRecyclerView) {
            adapter = MahjongItemAdapter()
            holdersAdapter = ShimmerPlaceHolderAdapter()
            layoutManager = GridLayoutManager(context, 4)
            addItemDecoration(MarginItemDecoration(10.dpToPx()))
        }

        with(binding.lottiePlaceHolderRecyclerView) {
            adapter = LottieAdapter()
            holdersAdapter = LottiePlaceHolderAdapter()
            addItemDecoration(MarginItemDecoration(15.dpToPx()))
        }

        with(binding.emojiPlaceHolderRecyclerView) {
            adapter = EmojiAdapter(Item("🥴"))
            holdersAdapter = RotationPlaceHolderAdapter()
            addItemDecoration(MarginItemDecoration(15.dpToPx()))
        }

        binding.loadMaterialButton.setOnClickListener {
            if (!loading) {
                loading = true
                lifecycleScope.launch {
                    toggle(true)
                    delay(2500)
                    toggle(false)
                    loading = false
                }
            }
        }

        lifecycleScope.launchWhenResumed { binding.loadMaterialButton.performClick() }
    }

    private fun toggle(show: Boolean) {
        if (::binding.isInitialized) {
            if (!show) {
                TransitionManager.beginDelayedTransition(binding.root as ViewGroup)
            }
            binding.mahjongPlaceHolderRecyclerView.toggleHoldersAdapter(show)
            binding.lottiePlaceHolderRecyclerView.toggleHoldersAdapter(show)
            with(binding.emojiPlaceHolderRecyclerView) {
                toggleHoldersAdapter(show)
                if (!(isHoldersAdapterVisible() || show)) {
                    (adapter as EmojiAdapter).reset()
                }
            }
        }
    }
}

fun Int.dpToPx(): Int = ceil((this * Resources.getSystem().displayMetrics.density).toDouble()).toInt()