package com.whw.aaclearn.scoreboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.whw.aaclearn.R
import com.whw.aaclearn.databinding.ActivityScoreBoardBinding

class ScoreBoardActivity : AppCompatActivity() {

    private  var teamModel:MyViewModel?=null
    private lateinit var binding: ActivityScoreBoardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_score_board)
        teamModel =  ViewModelProviders.of(this)[MyViewModel::class.java]
        binding.data=teamModel
        binding.lifecycleOwner=this
    }
}
