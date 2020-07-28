package kr.co.zooh.bts_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_one.setOnClickListener {
            Toast.makeText(this, "정국 사진", Toast.LENGTH_LONG).show()

            var intent = Intent(this, Photo1_Activity::class.java)
            startActivity(intent)
        }

    }
}
