package de.haveachin.vicet

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import de.haveachin.vicet.util.NotificationUtil
import de.haveachin.vicet.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
