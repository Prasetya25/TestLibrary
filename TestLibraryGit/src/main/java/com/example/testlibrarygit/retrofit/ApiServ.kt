package com.example.testlibrarygit.retrofit

import com.example.testlibrarygit.response.DetailUserResponse
import com.example.testlibrarygit.response.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface ApiServ {
    @GET("users")
    @Headers("Authorization: token "+"")
    fun getUsers(): Call<List<UserResponse>>

    @GET("users/{login}/followers")
    @Headers("Authorization: token "+"")
    fun getFollowers(@Path("login") login : String): Call<List<UserResponse>>

    @GET("users/{login}/following")
    @Headers("Authorization: token "+"")
    fun getFollowing(@Path("login") login : String): Call<List<UserResponse>>

    @GET("users/{login}")
    @Headers("Authorization: token "+"")
    fun getDetailUser(@Path("login") login : String): Call<DetailUserResponse>


}