package com.taken.data.remote.datasource.shop

import com.taken.data.remote.api.ShopApi
import javax.inject.Inject

class ShopRemoteDataSourceImpl @Inject constructor(
    private val shopApi: ShopApi
) : ShopRemoteDataSource {


}