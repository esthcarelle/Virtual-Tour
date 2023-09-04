package com.catchy.visitrwanda.repository

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.catchy.visitrwanda.model.Category
import com.google.firebase.firestore.FirebaseFirestore

class CategoryRepository {

    fun getEventsDB(): LiveData<MutableList<Category>> {
        val data = MutableLiveData<MutableList<Category>>()
        val myList = mutableListOf<Category>()
        FirebaseFirestore.getInstance()
            .collection("Category")
            .get().addOnSuccessListener {
                for(query in it.documents){
                   var category = Category(categoryUrl = query?.data?.get("CategoryUrl") as String, categoryName = query?.data?.get("CategoryName") as String,id = 0)
                    myList.add(category)
                }
                Log.e(TAG, "getEventsDB: "+it.documents.get(0).data )
                data.value = myList
            }.addOnFailureListener{
                // Handle exceptions
                Log.e(TAG, "getEventsDB: "+it.message )
            }
        return data
    }

}