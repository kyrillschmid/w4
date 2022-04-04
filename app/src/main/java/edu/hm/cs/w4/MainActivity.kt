package edu.hm.cs.w4

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :
    AppCompatActivity() {

    val timers: MutableList<Timer> =
        mutableListOf(
            Timer(10, "Timer 1"),
            Timer(20, "Timer 2")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val timerAdapter = TimerAdapter(timers)
        recyclerView.adapter = timerAdapter

        fab.setOnClickListener {
            val timerIdx = timers.size + 1
            val name = "Timer ${timerIdx}"
            timers.add(Timer(10 * timerIdx, name))

            timerAdapter.timers = timers
            timerAdapter.notifyDataSetChanged()

            Toast.makeText(this, "$name added", Toast.LENGTH_SHORT).show()
        }
    }


}
