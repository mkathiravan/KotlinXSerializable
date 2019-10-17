package net.kathir.kotlinxserializable

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.kotlin_serialize_view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class KotlinxSerializable : AppCompatActivity()
{
    private val TAG = this::class.java.simpleName



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_serialize_view)

        val textView = findViewById<TextView>(R.id.sample)


        Retrofitclient.createRetrofit().create(Api::class.java).getToDo().enqueue(object : Callback<Field> {
            override fun onFailure(call: Call<Field>, t: Throwable) {
            }

            override fun onResponse(call: Call<Field>, response: Response<Field>) {

                Log.d(TAG,"ONRESPONSE_BODY "+ response)

                response.body()?.let {
                    textView.text = it.toJsonBody()
                }
            }

        })



    }
}