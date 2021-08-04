package com.example.libraries

import android.content.Context
import android.widget.Toast

class ShowToasts {
    companion object {
        fun showToasts(context: Context, messenge: String, duration: Int) {
            Toast.makeText(context, messenge, duration).show()
        }
    }
}