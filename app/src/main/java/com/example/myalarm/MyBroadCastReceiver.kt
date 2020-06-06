package com.example.myalarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer

class MyBroadCastReceiver : BroadcastReceiver()

{
    override fun onReceive(p0: Context?, intent: Intent?) {

        var i = Intent(p0,AlarmOn::class.java)
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        p0?.startActivity(i)



    }


}
