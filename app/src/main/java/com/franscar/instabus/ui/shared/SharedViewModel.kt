package com.franscar.instabus.ui.shared

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.franscar.instabus.data.BusStations
import com.franscar.instabus.data.BusStationsRepository

class SharedViewModel(app: Application) : AndroidViewModel(app) {
    val busStationsData = BusStationsRepository(app).busStationsData
    val selectedBusStation = MutableLiveData<BusStations>()
}