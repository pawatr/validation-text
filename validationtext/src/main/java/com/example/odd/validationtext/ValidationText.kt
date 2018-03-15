package com.example.odd.validationtext

import android.content.Context
import android.util.Patterns

/**
 * Created by It-Stationnu on 15/3/2561.
 */

class ValidationText(val context: Context) {

    fun validEmail(email: String): Boolean {
        if (isEmptyData(email)) {
            return false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return false
        }
        return true
    }

    private fun isEmptyData(data: String?): Boolean {
        return data == null || data == ""
    }
}