package com.kamilazh.finalweather.features.weather_info_show.model

import com.kamilazh.finalweather.common.RequestCompleteListener
import com.kamilazh.finalweather.features.weather_info_show.model.data_class.City
import com.kamilazh.finalweather.features.weather_info_show.model.data_class.WeatherInfoResponse

interface WeatherInfoShowModel {
    fun getCityList(callback: RequestCompleteListener<MutableList<City>>)
    fun getWeatherInformation(cityId: Int, callback: RequestCompleteListener<WeatherInfoResponse>)
}