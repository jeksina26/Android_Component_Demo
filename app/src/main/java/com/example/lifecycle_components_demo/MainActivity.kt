package com.example.lifecycle_components_demo

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mess : String ;

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("mess","Call OnCrete Method")

        btnclick.setOnClickListener {

            val intent = Intent(this,
                ComponentsActivity::class.java)
            var pendingIntent = PendingIntent.getActivity(this,0,intent,0)
            val notification = Notification.Builder(this)
                .setSmallIcon(R.drawable.dropdown)
                .setContentTitle("Pending Intent Demo")
                .setContentText("Hello..!!")
            notification.setContentIntent(pendingIntent)

            var notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.notify(0,notification.build())
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("mess","Call OnStart Method")
    }

    override fun onResume() {
        super.onResume()
        Log.d("mess","Call OnResume Method")
    }

    override fun onPause() {
        super.onPause()
        Log.d("mess","Call OnPause Method")
    }

    override fun onStop() {
        super.onStop()
        Log.d("mess","Call OnStop Method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("mess","Call OnDestroy Method")
    }
}
