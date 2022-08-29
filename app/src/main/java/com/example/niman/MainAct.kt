package com.example.niman

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.niman.Fragments.FragOne
import com.example.niman.Fragments.FragTwo
import kotlinx.android.synthetic.main.activity_main3.*

class MainAct : AppCompatActivity() {
    var mainmanager:FragmentManager ?=null
    var fragone:FragOne ?=null
    var fragtwo:FragTwo ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        mainmanager=supportFragmentManager
        fragone= FragOne()
        fragtwo= FragTwo()
        mainmanager?.beginTransaction()?.add(R.id.Cont, fragtwo!!)?.commit()
        mainmanager?.beginTransaction()?.add(R.id.Cont, fragone!!)?.commit()



        bottomNavigationView2.setOnItemSelectedListener {
            if (it.itemId==R.id.tab1)
            {
                mainmanager?.beginTransaction()?.hide(fragtwo!!)?.show(fragone!!)?.commit()
            }

            if (it.itemId==R.id.tab2)
            {
                mainmanager?.beginTransaction()?.hide(fragone!!)?.show(fragtwo!!)?.commit()
            }

            false
        }

    }
}