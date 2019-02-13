package com.valdiviezo.anahi.misnotas

import android.app.Application
import android.arch.persistence.room.Room

class MisNotasApp: Application() {

    companion object {
        lateinit var database: TasksDatabase
    }

    override fun onCreate() {
        super.onCreate()
        MisNotasApp.database =  Room.databaseBuilder(this, TasksDatabase::class.java, "tasks-db").build()
    }
}