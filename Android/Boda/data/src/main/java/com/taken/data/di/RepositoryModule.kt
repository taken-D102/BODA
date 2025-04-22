package com.taken.data.di

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.taken.data.repository.datastore.DataStoreRepositoryImpl
import com.taken.domain.repository.DataStoreRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreRepository(dataStore: DataStore<Preferences>): DataStoreRepository {
        return DataStoreRepositoryImpl(dataStore)
    }
}