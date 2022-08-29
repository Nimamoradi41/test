package com.example.niman

import androidx.room.*
import com.example.niman.Tables.Tourtable
@Dao
interface TourDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(st: Tourtable)

    @Update
    fun update(st: Tourtable)

    @Delete
    fun delete(st: Tourtable)




    @Query("select * from Tourtable ")
    fun getAllTourtables(): List<Tourtable>
}