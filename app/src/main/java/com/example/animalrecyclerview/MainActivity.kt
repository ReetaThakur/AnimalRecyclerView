package com.example.animalrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val manager=supportFragmentManager
            val transaction=manager.beginTransaction()
            transaction.add((R.id.frmContainer),AnimalFragment(),"animal").commit()


    }

}