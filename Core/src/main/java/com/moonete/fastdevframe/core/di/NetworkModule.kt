package com.moonete.fastdevframe.core.di

import com.ihsanbal.logging.Level
import com.ihsanbal.logging.LoggingInterceptor
import com.moonete.fastdevframe.core.BuildConfig
import com.moonete.fastdevframe.core.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

/**
 * @Author: Moon-Ete
 * @CreateDate: 2021/3/14 17:55
 */
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(
                LoggingInterceptor.Builder()
                    .setLevel(if (BuildConfig.DEBUG) Level.BASIC else Level.NONE)
                    .request("Request")
                    .response("Response")
                    .build()
            )
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(Constant.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

}