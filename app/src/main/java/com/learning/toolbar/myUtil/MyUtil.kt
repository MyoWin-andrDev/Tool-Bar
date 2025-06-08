package com.learning.toolbar.myUtil

import android.content.Context
import android.widget.Toast
import com.google.android.material.appbar.MaterialToolbar
import com.learning.toolbar.R

fun Context.showToast(values: String) {
    Toast.makeText(this, values, Toast.LENGTH_SHORT).show()
}


fun MaterialToolbar.applyToolbar(isHome: Boolean = false, title: String, onBackPress: () -> Unit) {
    this.apply {
        this.title = title
        setTitleTextColor(context.getColor(R.color.md_theme_onPrimary))
        if(!isHome) setNavigationIcon(R.drawable.ic_back)
        setNavigationIconTint(context.getColor(R.color.md_theme_onPrimary))
        setNavigationOnClickListener {
            onBackPress()
        }
    }
}

