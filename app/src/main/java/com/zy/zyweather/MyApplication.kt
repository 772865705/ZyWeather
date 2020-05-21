package com.zy.zyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Date: 2020/5/14 0014
 * Author: Zhaoyue
 */
class MyApplication : Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        lateinit var app: MyApplication
        const val TOKEN = "Lnj8Ov5Y7AOLDT3W"
    }

    override fun onCreate() {
        super.onCreate()
        app = this
        context = applicationContext
    }
}