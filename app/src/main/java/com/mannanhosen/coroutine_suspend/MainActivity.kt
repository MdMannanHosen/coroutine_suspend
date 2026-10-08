package com.mannanhosen.coroutine_suspend

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable

import com.mannanhosen.coroutine_suspend.ui.theme.Coroutine_suspendTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

class MainActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Coroutine_suspendTheme {
                CoroutineScope(Dispatchers.Main).launch {
                    task1()
                    task2()

                }
            }



        }
    }

//    suspend fun task1(){
//        Log.d(TAG, "MANNAN HOSEN")
//        yield()
//        Log.d(TAG, "Rahat")
//    }
//
//    suspend fun task2(){
//        Log.d(TAG, "MANNAN HOSEN")
//        yield()
//        Log.d(TAG, "Rahat")
//    }

    suspend fun task1(){
        Log.d(TAG, "MANNAN HOSEN")
        delay(10000)
        Log.d(TAG, "Rahat")
    }
    suspend fun task2(){
        Log.d(TAG, "MANNAN HOSEN")
        delay(10000)
        Log.d(TAG, "Rahat")
    }
}



