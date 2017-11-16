package com.dp.logcat

import android.support.annotation.MainThread

interface LogcatEventListener {

    @MainThread
    fun onStartEvent()

    @MainThread
    fun onStartFailedEvent()

    @MainThread
    fun onLogEvent(log: Log)

    @MainThread
    fun onLogEvents(logs: List<Log>)

    @MainThread
    fun onStopEvent()

}