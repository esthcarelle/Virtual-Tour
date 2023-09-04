package com.catchy.visitrwanda.repository

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.catchy.visitrwanda.model.Place
import com.google.firebase.firestore.FirebaseFirestore

class PlaceRepository {

    fun getPopularPlaces(): LiveData<MutableList<Place>> {
        val data = MutableLiveData<MutableList<Place>>()
        val myList = mutableListOf<Place>()
        FirebaseFirestore.getInstance()
            .collection("Popular")
            .get().addOnSuccessListener {
                Log.e(TAG, "getPopularPlaces: "+it.documents )
                for(query in it.documents){
                    var place = Place(description = query?.data?.get("description") as String,ratings = query?.data?.get("ratings") as String,url = query?.data?.get("placeUrl") as String, name = query?.data?.get("placeName") as String,id = 0)
                    myList.add(place)
                }
                data.value = myList
            }.addOnFailureListener{
                // Handle exceptions
                Log.e(TAG, "getPlaces: "+it.message )
            }
        return data
    }
}