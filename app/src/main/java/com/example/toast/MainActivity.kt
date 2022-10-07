package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var buttonshow:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonshow =findViewById(R.id.btshowtoast)
        buttonshow.setText(R.string.buttontitle)// or in xml  android:text="@string/toastmessage"
    buttonshow.setOnClickListener {
        Toast.makeText(applicationContext,R.string.toastmessage,Toast.LENGTH_LONG).show()
    }
    }
}