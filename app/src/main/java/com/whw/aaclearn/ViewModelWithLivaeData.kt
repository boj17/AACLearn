package com.whw.aaclearn

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelWithLivaeData :ViewModel(){
    var  mutableLiveData: MutableLiveData<Int>? = null
      get() {
          if (field==null){
              field= MutableLiveData()
             var mutableLiveData= field as MutableLiveData
              mutableLiveData.value=0
          }
          return field
      }

    fun addNum(num:Int){
        mutableLiveData?.value=mutableLiveData?.value?.plus(num)
    }
}