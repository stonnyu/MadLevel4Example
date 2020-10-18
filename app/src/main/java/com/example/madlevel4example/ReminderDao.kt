package com.example.madlevel4example

import Reminder
import androidx.room.*

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminderTable")
    fun getAllReminders(): List<Reminder>

    @Insert
    fun insertReminder(reminder: Reminder)

    @Delete
    fun deleteReminder(reminder: Reminder)

    @Update
    fun updateReminder(reminder: Reminder)

}