package com.example.niman

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Factor")
class Factor {

    @PrimaryKey(autoGenerate = true)
    var Id:Int ?=null

    @ColumnInfo(name = "NameCostomer")
    var NameCostomer :String ?=null


    @ColumnInfo(name = "Date")
    var Date :String ?=null

    @ColumnInfo(name = "Price")
    var Price :String ?=null


    @ColumnInfo(name = "Vahed")
    var Vahed :String ?=null

    @ColumnInfo(name = "Joz")
    var Joz :String ?=null


    @ColumnInfo(name = "Kol")
    var Kol :String ?=null


    @ColumnInfo(name = "Type")
    var Type :Int ?=null

    @ColumnInfo(name = "Mohtava")
    var Mohtava :String ?=null

    @ColumnInfo(name = "JozPrice")
    var JozPrice :String ?=null
}