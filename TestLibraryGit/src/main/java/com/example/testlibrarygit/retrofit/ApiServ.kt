package com.example.testlibrarygit.retrofit

import com.example.testlibrarygit.response.DetailUserResponse
import com.example.testlibrarygit.response.UserResponse
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