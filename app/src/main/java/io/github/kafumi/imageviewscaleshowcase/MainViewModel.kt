package io.github.kafumi.imageviewscaleshowcase

import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.kafumi.imageviewscaleshowcase.util.map

class MainViewModel : ViewModel() {
    val scaleTypeEntries = ImageView.ScaleType.values().map { it.name }
    val scaleTypePosition = MutableLiveData<Int>()
    val scaleType = scaleTypePosition.map { ImageView.ScaleType.values()[it] }

    init {
        scaleTypePosition.value = ImageView.ScaleType.FIT_CENTER.ordinal
    }
}