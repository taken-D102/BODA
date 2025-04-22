package com.taken.data.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.taken.data.remote.api.AuthApi
import com.taken.data.remote.api.DeviceUserApi
import com.taken.data.remote.api.HomeApi
import com.taken.data.remote.api.MapApi
import com.taken.data.remote.api.MemberApi
import com.taken.data.remote.api.ReportsApi
import com.taken.data.remote.api.RewardsApi
import com.taken.data.remote.api.ShopApi
import com.taken.data.utils.JwtInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private const val BASE_URL = "/"

    @Provides
    @Singleton
    fun provideMoshiConverterFactory(): MoshiConverterFactory {
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        return MoshiConverterFactory.create(moshi)
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(jwtInterceptor: JwtInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(jwtInterceptor)
            .build()
    }

    @Provides
    @Singleton
    @Named("Boda")
    fun provideGivuRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(provideMoshiConverterFactory())
            .build()
    }

    @Provides
    @Singleton
    fun provideAuthApiService(@Named("Boda") retrofit: Retrofit): AuthApi {
        return retrofit.create(AuthApi::class.java)
    }

    @Provides
    @Singleton
    fun provideDeviceUserApiService(@Named("Boda") retrofit: Retrofit): DeviceUserApi {
        return retrofit.create(DeviceUserApi::class.java)
    }

    @Provides
    @Singleton
    fun provideHomeApiService(@Named("Boda") retrofit: Retrofit): HomeApi {
        return retrofit.create(HomeApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMapApiService(@Named("Boda") retrofit: Retrofit): MapApi {
        return retrofit.create(MapApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMemberApiService(@Named("Boda") retrofit: Retrofit): MemberApi {
        return retrofit.create(MemberApi::class.java)
    }

    @Provides
    @Singleton
    fun provideReportsApiService(@Named("Boda") retrofit: Retrofit): ReportsApi {
        return retrofit.create(ReportsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRewardsApiService(@Named("Boda") retrofit: Retrofit): RewardsApi {
        return retrofit.create(RewardsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideShopApiService(@Named("Boda") retrofit: Retrofit): ShopApi {
        return retrofit.create(ShopApi::class.java)
    }
}