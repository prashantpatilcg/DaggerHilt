package com.hsarp.daggerhilt.data.api

import com.hsarp.daggerhilt.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}