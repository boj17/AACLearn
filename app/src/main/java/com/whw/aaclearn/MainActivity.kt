package com.whw.aaclearn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.whw.aaclearn.databinding.DatabindingActivity
import com.whw.aaclearn.livedata.LiveDataActivity
import com.whw.aaclearn.scoreboard.ScoreBoardActivity
import com.whw.aaclearn.viewdoel.ViewModelActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLifecycle.setOnClickListener {
            goToActivity(ViewModelActivity::class.java)
        }
        btnLiveData.setOnClickListener {
            goToActivity(LiveDataActivity::class.java)
        }

        btnDatabinding.setOnClickListener {
            goToActivity(DatabindingActivity::class.java)
        }

        btnScoreBoard.setOnClickListener {
            goToActivity(ScoreBoardActivity::class.java)
        }

    }

    private fun goToActivity(clazz: Class<*>) {
        val intent = Intent(MainActivity@ this, clazz)
        startActivity(intent)
    }
}
