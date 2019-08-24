package com.whw.aaclearn.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.whw.aaclearn.R
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {

    lateinit var viewModel: ViewModelWithLivaeData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        viewModel=ViewModelProviders.of(this)[ViewModelWithLivaeData::class.java]
        //进行观察 获取每次数据改变后的数据进行更新
        val numObserve=Observer<Int>{num->
            tv1.text=num.toString()
        }
        viewModel.mutableLiveData?.observe(this,numObserve)
        imageBtn1.setOnClickListener {  viewModel.addNum(1)}
        imageBtn2.setOnClickListener {  viewModel.addNum(-1)}
    }
}
