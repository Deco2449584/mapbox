package com.skg.mapbox.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.skg.mapbox.model.GeoJSONData

class GeoJSONDataViewModel: ViewModel() {
    var _geoJSONData : ArrayList<GeoJSONData> by mutableStateOf(arrayListOf())
}