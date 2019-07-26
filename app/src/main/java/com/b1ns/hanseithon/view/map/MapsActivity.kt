package com.b1ns.hanseithon.view.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.b1ns.hanseithon.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.chip.*

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private var count = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        mapMarker()
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera

    }


    fun mapMarker(){
        chip1.setOnClickListener {

        }
        chip2.setOnClickListener {

        }
        chip3.setOnClickListener {

        }
        chip4.setOnClickListener {

        }
        chip5.setOnClickListener {

        }
        chip6.setOnClickListener {

        }
    }
}

