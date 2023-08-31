package com.catchy.visitrwanda.viewModel

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.catchy.visitrwanda.model.Category
import com.catchy.visitrwanda.repository.CategoryRepository

class CategoryViewModel: ViewModel() {

    private var repo = CategoryRepository()
    val _mutableData = MutableLiveData<List<Category>>()
    val mutableData : LiveData<List<Category>> = _mutableData

    init{
        fetchEventData()
    }

    private fun fetchEventData(): LiveData<List<Category>> {
        repo.getEventsDB().observeForever { eventList ->
            Log.e(TAG, "fetchEventData: "+eventList)
            _mutableData.value = eventList
        }

        return _mutableData
    }
}