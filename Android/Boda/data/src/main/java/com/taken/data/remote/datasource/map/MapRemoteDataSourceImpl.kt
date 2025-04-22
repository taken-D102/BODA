package com.taken.data.remote.datasource.map

import com.taken.data.remote.api.MapApi
import javax.inject.Inject

class MapRemoteDataSourceImpl @Inject constructor(
    private val mapApi: MapApi
) : MapRemoteDataSource {
}