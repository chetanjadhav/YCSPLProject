package com.chetan.yCSPLProject.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chetan.yCSPLProject.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity() {
    lateinit var mapFragment: SupportMapFragment
    lateinit var googleMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val email:String = intent.getStringExtra("email").toString()
        getSupportActionBar()?.setTitle(email);

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync {
            googleMap = it
            val location  =LatLng(18.6042537,73.7579052)
            googleMap.addMarker(MarkerOptions().position(location))
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location,15f))

        }

    }


}