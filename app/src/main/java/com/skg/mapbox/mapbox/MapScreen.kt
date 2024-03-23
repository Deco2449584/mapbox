package com.skg.mapbox.mapbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mapbox.geojson.Point


@Composable
fun MapScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        MapBoxMap(
            point = Point.fromLngLat(-74.20330325767281, 4.638675493693809), //4.638675493693809, -74.20330325767281
            modifier = Modifier
                .fillMaxSize()
        )
    }
}