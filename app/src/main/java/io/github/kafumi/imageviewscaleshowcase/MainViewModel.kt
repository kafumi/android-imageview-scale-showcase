package io.github.kafumi.imageviewscaleshowcase

import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.kafumi.imageviewscaleshowcase.util.map

class MainViewModel : ViewModel() {
    val scaleTypeEntries = ImageView.ScaleType.values().map { it.name }
    val scaleTypePosition = MutableLiveData<Int>()
    val scaleType = scaleTypePosition.map { ImageView.ScaleType.values()[it] }

    val imageSizeEntries = ImageSize.values().map { it.name }
    val imageSizePosition = MutableLiveData<Int>()
    val imageResId = imageSizePosition.map { ImageSize.values()[it].drawableRes }

    init {
        scaleTypePosition.value = ImageView.ScaleType.FIT_CENTER.ordinal
        imageSizePosition.value = ImageSize.LARGE.ordinal
    }

    enum class ImageSize(val drawableRes: Int) {
        LARGE(R.drawable.large),
        MEDIUM(R.drawable.medium),
        SMALL(R.drawable.small);
    }
}