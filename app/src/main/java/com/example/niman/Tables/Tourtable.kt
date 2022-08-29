package com.example.niman.Tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Tourtable")
class Tourtable {
    @PrimaryKey(autoGenerate = true)
    var Id:Int ?=null

    @ColumnInfo(name = "NumberTour")
    var NumberTour:Int ?=null
    @ColumnInfo(name = "CountFactor")
    var CountFactor:Int ?=null
    @ColumnInfo(name = "Data")
    var Data:String ?=null
    @ColumnInfo(name = "Car")
    var Car:String ?=null
    @ColumnInfo(name = "Driver")
    var Driver:String ?=null
    @ColumnInfo(name = "Distribiotor")
    var Distribiotor:String ?=null
    @ColumnInfo(name = "Distant")
    var Distant:String ?=null
    @ColumnInfo(name = "DigitFactor")
    var DigitFactor:String ?=null


    @ColumnInfo(name = "TurnOn")
    var TurnOn:Boolean ?=null

}