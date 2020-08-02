package kr.co.zooh.bts_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_photo1_.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_one.setOnClickListener {
            Toast.makeText(this, "정국 사진", Toast.LENGTH_LONG).show()
            var intent = Intent(this, Photo1_Activity::class.java)
            startActivity(intent)
        }
        btn_two.setOnClickListener {
            Toast.makeText(this, "뷔 사진", Toast.LENGTH_LONG).show()
            var intent = Intent(this, Photo2_Activity::class.java)
            startActivity(intent)
        }
        btn_three.setOnClickListener {
            Toast.makeText(this, "지민 사진", Toast.LENGTH_LONG).show()
            var intent = Intent(this, Photo3_Activity::class.java)
            startActivity(intent)
        }
        btn_four.setOnClickListener {
            Toast.makeText(this, "슈가 사진", Toast.LENGTH_LONG).show()
            var intent = Intent(this, Photo4_Activity::class.java)
            startActivity(intent)
        }
        btn_five.setOnClickListener {
            Toast.makeText(this, "진 사진", Toast.LENGTH_LONG).show()
            var intent = Intent(this, Photo5_Activity::class.java)
            startActivity(intent)
        }
        btn_six.setOnClickListener {
            Toast.makeText(this, "RM 사진", Toast.LENGTH_LONG).show()
            var intent = Intent(this, Photo6_Activity::class.java)
            startActivity(intent)
        }
        btn_seven.setOnClickListener {
            Toast.makeText(this, "제이홉 사진", Toast.LENGTH_LONG).show()
            var intent = Intent(this, Photo7_Activity::class.java)
            startActivity(intent)
        }
    }
}
