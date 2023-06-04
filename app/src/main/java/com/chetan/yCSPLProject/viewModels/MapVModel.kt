package com.chetan.yCSPLProject.viewModels

import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapVModel : ViewModel() {


    fun onMapReady(map: GoogleMap){

        val location  = LatLng(18.6042537,73.7579052)
        map.addMarker(MarkerOptions().position(location))
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(location,15f))

    }
}