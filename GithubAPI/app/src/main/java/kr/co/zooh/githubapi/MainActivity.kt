package kr.co.zooh.githubapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    val BASE_URL = "https://api.github.com/search/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var retrofit : Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        var api : API = retrofit.create(API::class.java)
        var call : Call<UserData> = api.getUser()

        call.enqueue(object : Callback<UserData>{
            override fun onFailure(call: Call<UserData>, t: Throwable) {

            }

            override fun onResponse(call: Call<UserData>, response: Response<UserData>) {
                for (str in response?.body()?.items!!){
                    Log.e("MAINACTIVITY", str.login)
                }
            }

        })
    }
}
