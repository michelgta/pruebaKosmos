package com.example.android.roomwordssample.di

import com.example.android.roomwordssample.utils.Constants.URL_BASE
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.skydoves.sandwich.coroutines.CoroutinesResponseCallAdapterFactory
import mx.com.movieschallenge.data.remote.HttpInterceptor.createOkHttpInterceptor
import mx.com.movieschallenge.data.remote.WordsEndpoints
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


val NetworkModule = module {

    single {
        OkHttpClient.Builder()
            .addInterceptor(createOkHttpInterceptor())
            .addNetworkInterceptor(StethoInterceptor())
            .build()
    }

    single {
        Retrofit.Builder()
            .client(get<OkHttpClient>())
            .baseUrl(URL_BASE)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutinesResponseCallAdapterFactory())
            .build()
    }

    single { get<Retrofit>().create(WordsEndpoints::class.java) }
}