package com.example.myalarm

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

         var seconds = editText.text.toString().toInt()
            var i = Intent(applicationContext, MyBroadCastReceiver :: class.java)
            var pi = PendingIntent.getBroadcast(applicationContext,111,i,0 )
            var am : AlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

            am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(seconds*1000),pi)

            Toast.makeText(applicationContext, "YOUR ALARM IS SET FOR $seconds SECONDS",Toast.LENGTH_LONG).show()




        }
    }
}
