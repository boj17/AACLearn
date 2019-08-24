package com.whw.aaclearn.viewdoel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.whw.aaclearn.R
import kotlinx.android.synthetic.main.activity_lifecycle.*


class ViewModelActivity : AppCompatActivity() {


    lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        myViewModel = ViewModelProviders.of(this)[MyViewModel::class.java]
        tv1.text = myViewModel.num.toString()
        btn1.setOnClickListener {
            myViewModel.num++
            tv1.text = myViewModel.num.toString()

        }
        btn2.setOnClickListener {
            myViewModel.num += 2
            tv1.text = myViewModel.num.toString()
        }
    }

}
