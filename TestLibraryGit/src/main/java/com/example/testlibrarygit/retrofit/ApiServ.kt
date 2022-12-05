package com.example.testlibrarygit.retrofit

import com.example.testlibrarygit.response.DetailUserResponse
import com.example.testlibrarygit.response.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path

interface ApiServ {
    @GET("users")
    fun getUsers(@Header("Authorization") tokenGithub : String): Call<List<UserResponse>>

    @GET("users/{login}/followers")
    fun getFollowers(@Header("Authorization") tokenGithub : String, @Path("login") login : String): Call<List<UserResponse>>

    @GET("users/{login}/following")
    fun getFollowing(@Header("Authorization") tokenGithub : String, @Path("login") login : String): Call<List<UserResponse>>

    @GET("users/{login}")
    fun getDetailUser(@Header("Authorization") tokenGithub : String, @Path("login") login : String): Call<DetailUserResponse>

}