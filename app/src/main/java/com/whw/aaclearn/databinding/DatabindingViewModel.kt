package com.whw.aaclearn.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DatabindingViewModel:ViewModel() {

    var num:MutableLiveData<Int>? = null
        get() {
        if (field==null){
            field=MutableLiveData()
            val mutableLiveData=  field as MutableLiveData
            mutableLiveData.value=0
        }
            return field
    }

    fun add(){
        this.num?.value=num?.value?.plus(1)
    }

}