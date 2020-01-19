package com.tanjiajun.mmkvdemo

import android.util.Log
import androidx.multidex.MultiDexApplication
import com.tencent.mmkv.MMKV

/**
 * Created by TanJiaJun on 2020-01-14.
 */
class MMKVDemoApplication : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        val rootDir = MMKV.initialize(this)
        Log.i("TanJiaJun", rootDir)
    }

}