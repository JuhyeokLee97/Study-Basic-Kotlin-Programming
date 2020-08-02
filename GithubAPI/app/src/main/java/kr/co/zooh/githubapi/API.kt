package kr.co.zooh.githubapi

import retrofit2.Call
import retrofit2.http.GET

interface API {

    @GET("users?q=himchanyoon")
    fun getUser() : Call<UserData>
}