package com.whw.aaclearn.scoreboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    var aLastScore: Int? = null
    var bLastScore: Int? = null

    var aTeamScore: MutableLiveData<Int>? = null
        get() {
            if (field == null) {
                field = MutableLiveData()
                val mutableLiveData = field as MutableLiveData
                mutableLiveData.value = 0
            }
            return field
        }

    var bTeamScore: MutableLiveData<Int>? = null
        get() {
            if (field == null) {
                field = MutableLiveData()
                val mutableLiveData = field as MutableLiveData
                mutableLiveData.value = 0
            }
            return field
        }

    fun aTeamAdd(num: Int) {
        aLastScore = aTeamScore?.value
        bLastScore = bTeamScore?.value
        aTeamScore?.value = aTeamScore?.value?.plus(num)

    }

    fun bTeamAdd(num: Int) {
        aLastScore = aTeamScore?.value
        bLastScore = bTeamScore?.value
        bTeamScore?.value = bTeamScore?.value?.plus(num)
    }

    /**
     * 清空
     */
    fun refresh() {
        aTeamScore?.value = 0
        bTeamScore?.value = 0
    }

    /**
     * 撤销一次
     */
    fun undo(){
        aTeamScore?.value = aLastScore
        bTeamScore?.value = bLastScore
    }

}