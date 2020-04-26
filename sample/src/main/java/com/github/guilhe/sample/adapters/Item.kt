package com.github.guilhe.sample.adapters

data class Item(var status: String) {
    fun changeStatus() {
        status = when (status) {
            "🥴" -> "🤮"
            "🤮" -> "😅"
            else -> "😇"
        }
    }
}