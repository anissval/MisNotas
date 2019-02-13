package com.valdiviezo.anahi.misnotas

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "task_entity")
data class TaskEntity (
        @PrimaryKey(autoGenerate = true)
        var id:Int = 0,
        var name:String = "",
        var isDone:Boolean = false
)