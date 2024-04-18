package kr.ac.kopo.framelayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var imgV1: ImageView
    lateinit var imgV2: ImageView
    lateinit var imgV3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)
        btn3 = findViewById<Button>(R.id.btn3)

        imgV1 = findViewById<ImageView>(R.id.imgV1)
        imgV2 = findViewById<ImageView>(R.id.imgV2)
        imgV3 = findViewById<ImageView>(R.id.imgV3)

        imgV2.visibility = View.INVISIBLE
        imgV3.visibility = View.INVISIBLE

        btn1.setOnClickListener(btnListener)
        btn2.setOnClickListener(btnListener)
        btn3.setOnClickListener(btnListener)
    }

    val btnListener = OnClickListener {
        imgV1.visibility = View.INVISIBLE
        imgV2.visibility = View.INVISIBLE
        imgV3.visibility = View.INVISIBLE
        when(it.id) {
            R.id.btn1 -> imgV1.visibility = View.VISIBLE
            R.id.btn2 -> imgV2.visibility = View.VISIBLE
            R.id.btn3 -> imgV3.visibility = View.VISIBLE
        }
    }
}