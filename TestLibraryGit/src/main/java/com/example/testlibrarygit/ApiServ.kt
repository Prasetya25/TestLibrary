package com.example.testlibrarygit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface ApiServ {
    @GET("users")
    @Headers("Authorization: token "+"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")
    fun getUsers(): Call<List<UserResponse>>

    @GET("users/{login}/followers")
    @Headers("Authorization: token "+"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")
    fun getFollowers(@Path("login") login : String): Call<List<UserResponse>>

    @GET("users/{login}/following")
    @Headers("Authorization: token "+"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")
    fun getFollowing(@Path("login") login : String): Call<List<UserResponse>>

    @GET("users/{login}")
    @Headers("Authorization: token "+"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")
    fun getDetailUser(@Path("login") login : String): Call<DetailUserResponse>


}