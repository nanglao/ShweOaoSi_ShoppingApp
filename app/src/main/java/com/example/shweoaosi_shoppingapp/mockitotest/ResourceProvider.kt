package com.example.shweoaosi_shoppingapp.mockitotest

import android.content.res.Resources
import androidx.annotation.StringRes

class ResourceProvider(private var resources: Resources) {

    fun getString(@StringRes stringResId: Int): String {
        return resources.getString(stringResId)
    }
}
