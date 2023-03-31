package com.hms.explorehmscompose.base

import android.content.Context
import androidx.activity.ComponentActivity
import com.huawei.hms.feature.dynamicinstall.FeatureCompat

class BaseComponentActivity: ComponentActivity() {

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)
        // Initialize the SDK in the activity.
        FeatureCompat.install(newBase)
    }
}