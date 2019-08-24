package com.whw.aaclearn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       btnLifecycle.setOnClickListener {
           val intent= Intent(MainActivity@this,ViewModelActivity::class.java)
           startActivity(intent)
       }
        btnLiveData.setOnClickListener {
            val intent= Intent(MainActivity@this,LiveDataActivity::class.java)
            startActivity(intent)
        }

        btnDatabinding.setOnClickListener {
            val intent= Intent(MainActivity@this,DatabindingActivity::class.java)
            startActivity(intent)
        }
    }
}
