package com.example.niman.Tables


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Student")
class Student {

    @PrimaryKey(autoGenerate = true)
    var Id:Int ?=null


    @ColumnInfo(name = "Name")
    var Name:String ?=null


    @ColumnInfo(name = "Lastname")
    var Lastname:String ?=null


    @ColumnInfo(name = "Cource")
    var Cource:String ?=null


}