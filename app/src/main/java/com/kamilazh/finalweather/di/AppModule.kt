package com.kamilazh.finalweather.di

import android.app.Application
import android.content.Context
import com.kamilazh.finalweather.features.weather_info_show.view.MainActivity
import com.kamilazh.finalweather.network.ApiInterface
import com.kamilazh.finalweather.network.RetrofitClient

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    abstract fun provideContext(application: Application): Context

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivityInjector(): MainActivity

    companion object {

        @Provides
        @Singleton
        @JvmStatic
        fun provideApiService() : ApiInterface {
            return RetrofitClient.client.create(ApiInterface::class.java)
        }
    }
}