package com.vilkov.pricemonitoring.Activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.vilkov.pricemonitoring.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        supportFragmentManager
            .beginTransaction().replace(R.id.authorization, AuthorizationFragment.newInstance()).commit()
    }

    fun clickAuthorizationButton(view: View) {
        supportFragmentManager
            .beginTransaction().replace(R.id.registration, AuthorizationFragment.newInstance()).commit()
    }

}