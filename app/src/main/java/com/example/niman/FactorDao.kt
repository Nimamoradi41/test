package com.example.niman

import androidx.room.*
import com.example.niman.Tables.Tourtable
@Dao
interface FactorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(st: Factor)

    @Update
    fun update(st: Factor)

    @Delete
    fun delete(st: Factor)




    @Query("select * from Factor ")
    fun getAllFactors(): List<Factor>
}