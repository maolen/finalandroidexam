package com.kamilazh.finalweather.features.weather_info_show.presenter

interface WeatherInfoShowPresenter {
    fun fetchCityList()
    fun fetchWeatherInfo(cityId: Int)
    fun detachView()
}