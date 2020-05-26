package com.zy.zyweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}


fun main(){
    println(
        "Main:threadName = ${Thread.currentThread().name},threadId = ${Thread.currentThread().id}"
    )

    repeat(20){
        GlobalScope.launch {
            println(
                "IO:threadName = ${Thread.currentThread().name},threadId = ${Thread.currentThread().id}"
            )
            delay(1000)
        }
    }

}
