package com.catchy.visitrwanda.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.catchy.visitrwanda.model.Place
import com.catchy.visitrwanda.repository.PlaceRepository

class PopularPlaceViewModel: ViewModel() {

    private var repo = PlaceRepository()
    private val _mutableData = MutableLiveData<List<Place>>()
    val mutableData : LiveData<List<Place>> = _mutableData

    init{
        fetchEventData()
    }

    private fun fetchEventData(): LiveData<List<Place>> {
        repo.getPopularPlaces().observeForever { eventList ->
            _mutableData.value = eventList
        }

        return _mutableData
    }
}