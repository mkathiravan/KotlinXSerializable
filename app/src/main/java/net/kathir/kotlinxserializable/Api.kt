package net.kathir.kotlinxserializable

import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("todos/1")
    fun getToDo():Call<Field>

    @GET("posts")
    fun getPosts():Call<List<User>>
}