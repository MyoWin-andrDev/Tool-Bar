package com.learning.toolbar.myUtil

import android.content.Context
import android.widget.Toast

fun Context.showToast(values : String){
    Toast.makeText(this, values , Toast.LENGTH_LONG).show()
}