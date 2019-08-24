package com.whw.aaclearn.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.whw.aaclearn.R

class DatabindingActivity : AppCompatActivity() {

    lateinit var viewmodel: DatabindingViewModel
    lateinit var binding: ActivityDatabindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_databinding)
        viewmodel=ViewModelProviders.of(this)[DatabindingViewModel::class.java]
        //设置数据
        binding.model=viewmodel
        //LiveData的监听
        binding.lifecycleOwner=this
    }
}
