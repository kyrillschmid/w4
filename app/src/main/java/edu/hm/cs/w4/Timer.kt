package edu.hm.cs.w4

import android.content.Context
import android.content.Intent
import android.provider.AlarmClock

class Timer(val seconds: Int, val name: String) {

    fun startTimer(context: Context) {
        val intent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, name)
            putExtra(AlarmClock.EXTRA_LENGTH, seconds)
            putExtra(AlarmClock.EXTRA_SKIP_UI, false)
        }
        if (intent.resolveActivity(context.packageManager) != null) {
            context.startActivity(intent)
        }
    }
}