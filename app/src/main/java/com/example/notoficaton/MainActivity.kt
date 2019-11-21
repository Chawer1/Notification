package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.notoficaton.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.show)
        button.setOnClickListener {
            val builder =
                NotificationCompat.Builder(this@MainActivity, CHANNEL_ID)
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setContentTitle("Напоминание")
                    .setContentText("Пора покормить кота")
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            val notificationManager =
                NotificationManagerCompat.from(this@MainActivity)
            notificationManager.notify(NOTIFY_ID, builder.build())
        }
    }

    companion object {
        private const val NOTIFY_ID = 101
        private const val CHANNEL_ID = "com.example.myapplication;"
    }
}