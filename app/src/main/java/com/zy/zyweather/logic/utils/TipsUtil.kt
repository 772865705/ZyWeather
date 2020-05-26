package com.zy.zyweather.logic.utils

import android.widget.Toast
import com.zy.zyweather.MyApplication

/**
 * Date: 2020/5/26 0026
 * Author: Zhaoyue
 */

fun String.showToast() = Toast.makeText(MyApplication.context,this,Toast.LENGTH_SHORT).show()
