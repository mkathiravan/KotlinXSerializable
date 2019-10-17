package net.kathir.kotlinxserializable

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class KotlinxSerializableArray : AppCompatActivity() {

    private val TAG = this::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_serialize_view)

        val textView = findViewById<TextView>(R.id.sample)


        Retrofitclient.createRetrofit().create(Api::class.java).getPosts().enqueue(object : Callback<List<User>> {
            override fun onFailure(call: Call<List<User>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {

                Log.d(TAG,"ONSURESS_RESPONSE "+ response.body())

                Log.d(TAG,"ON_RESPONSE_DATA "+ response.body())

                response.body()?.let {
                    textView.text = it.last().body

                }
            }


        })
    }
}