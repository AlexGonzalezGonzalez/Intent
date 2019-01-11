package com.ajgg.app1.premieremaster


import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import org.jetbrains.anko.toast


class Activity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        //Activity que solo muestra un toast
        toast("Activity 2")

    }
    }