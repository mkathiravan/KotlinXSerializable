package net.kathir.kotlinxserializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinx_serializable.setOnClickListener {

            val startIntent = Intent(this,KotlinxSerializable::class.java)
            startActivity(startIntent)
        }


        kotlinx_serialiablearray.setOnClickListener {

            val startIntent = Intent(this,KotlinxSerializableArray::class.java)
            startActivity(startIntent)
        }
    }
}
