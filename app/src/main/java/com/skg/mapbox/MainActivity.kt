package com.skg.mapbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.skg.mapbox.mapbox.MapScreen
import com.skg.mapbox.ui.theme.MapboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MapboxTheme {

                MapScreen()
            }
        }
    }
}
