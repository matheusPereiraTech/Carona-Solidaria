package com.example.caronasolidria

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.annotation.ColorInt

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

   //     if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
    //        window.statusBarColor(R.color.colorPrimary)
    //    }
    }
    //fun Window.setStatusBarColor(color: Int){
   //     this.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    //    this.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    //    this.statusBarColor = contextCompact.getColor(baseContext,color)
   // }
}