package com.hms.explorehms

import android.app.Application
import android.content.Context
import com.huawei.hms.feature.dynamicinstall.FeatureCompat

class EHCApplication: Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        // Start the Dynamic Ability SDK.
        FeatureCompat.install(base)
    }
}