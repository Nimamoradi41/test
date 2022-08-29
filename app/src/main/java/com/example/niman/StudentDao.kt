package com.example.niman


import androidx.room.*
import com.example.niman.Tables.Student

@Dao
interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(st: Student)

    @Update
    fun update(st: Student)

    @Delete
    fun delete(st: Student)


    @Query("DELETE FROM Student")
    fun nukeTable();

    @Query("select * from Student ")
    fun getAllStudents(): List<Student>

}