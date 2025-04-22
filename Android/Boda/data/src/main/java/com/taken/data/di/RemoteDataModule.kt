package com.taken.data.di

import com.taken.data.remote.api.MapApi
import com.taken.data.remote.api.ShopApi
import com.taken.data.remote.datasource.map.MapRemoteDataSource
import com.taken.data.remote.datasource.map.MapRemoteDataSourceImpl
import com.taken.data.remote.datasource.shop.ShopRemoteDataSource
import com.taken.data.remote.datasource.shop.ShopRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    @Singleton
    fun provideMapRemoteDataSource(mapApi: MapApi): MapRemoteDataSource {
        return MapRemoteDataSourceImpl(mapApi)
    }

    @Provides
    @Singleton
    fun provideShopRemoteDataSource(shopApi: ShopApi): ShopRemoteDataSource {
        return ShopRemoteDataSourceImpl(shopApi)
    }
}