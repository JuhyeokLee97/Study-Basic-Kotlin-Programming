package kr.co.zooh.listview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.listview_item.view.*

class MainActivity : AppCompatActivity() {
    val list_sample = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list_sample.add("Android")
        list_sample.add("IOS")
        list_sample.add("Galaxy")
        list_sample.add("Apple")

        listView.adapter = MainlistAdapter(this, list_sample)
    }
    inner class MainlistAdapter(val context : Context, val list : ArrayList<String>) : BaseAdapter(){
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var view : View  = LayoutInflater.from(context).inflate(R.layout.listview_item, null)
            view.list_item_text.setText(list[position])

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
