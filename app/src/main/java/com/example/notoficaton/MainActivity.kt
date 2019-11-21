package com.example.notoficaton

import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    val notification: Notification = NotificationCompat.Builder(this)
        .setSmallIcon(R.drawable.ic_main_notification)
        .setContentTitle("Motivation notification")
        .setContentText("Some motivation text here")
        .build()


    val notificationManager: Any? = getSystemService(NOTIFICATION_SERVICE)
}
