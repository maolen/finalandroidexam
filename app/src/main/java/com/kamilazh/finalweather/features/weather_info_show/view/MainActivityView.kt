package com.kamilazh.finalweather.features.weather_info_show.view

import com.kamilazh.finalweather.features.weather_info_show.model.data_class.City
import com.kamilazh.finalweather.features.weather_info_show.model.data_class.WeatherDataModel

interface MainActivityView {
    fun handleProgressBarVisibility(visibility: Int)
    fun onCityListFetchSuccess(cityList: MutableList<City>)
    fun onCityListFetchFailure(errorMessage: String)
    fun onWeatherInfoFetchSuccess(weatherDataModel: WeatherDataModel)
    fun onWeatherInfoFetchFailure(errorMessage: String)
}