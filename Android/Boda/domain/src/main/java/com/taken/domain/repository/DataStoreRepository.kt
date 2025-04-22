package com.taken.domain.repository

import kotlinx.coroutines.flow.Flow

interface DataStoreRepository {

    suspend fun setJwt(jwt: String)

    fun getJwt(): Flow<String?>
}