package edu.hm.cs.w4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.timer_view_holder.view.*

class TimerAdapter(var timers: List<Timer>) :
    RecyclerView.Adapter<TimerAdapter.TimerViewHolder>() {

    class TimerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(timer: Timer) {
            itemView.timer_name.text = timer.name
            itemView.timer_seconds.text = "Time: ${timer.seconds} seconds"

            itemView.setOnClickListener { timer.startTimer(itemView.context) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimerViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.timer_view_holder, parent, false)
        return TimerViewHolder(itemView)
    }

    override fun getItemCount(): Int = timers.size

    override fun onBindViewHolder(holder: TimerViewHolder, position: Int) =
        holder.bind(timers[position])
}