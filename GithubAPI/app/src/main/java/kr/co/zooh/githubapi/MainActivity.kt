package kr.co.zooh.githubapi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.listview_item.*
import kotlinx.android.synthetic.main.listview_item.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    val BASE_URL = "https://api.github.com/search/"
    val arr = ArrayList<String>()

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
                    arr.add(str.login)
                }
                listView.adapter = MainListviewAdapter(this@MainActivity, arr)
            }

        })
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, arr.get(position), Toast.LENGTH_LONG).show()
        }
    }
    inner class MainListviewAdapter(val context : Context, val list : ArrayList<String>) : BaseAdapter(){
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var view : View = LayoutInflater.from(context).inflate(R.layout.listview_item, null)
            view.listview_item_id.setText(list.get(position))

            return view
        }

        override fun getItem(position: Int): Any {
            return 0
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getCount(): Int {
            return list.size
        }

    }
}
