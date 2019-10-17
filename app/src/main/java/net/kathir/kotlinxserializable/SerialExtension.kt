package net.kathir.kotlinxserializable

import kotlinx.serialization.json.JSON
import kotlinx.serialization.list
import kotlinx.serialization.parseList

fun String.toFiled():Field
{
    return JSON.parse(Field.serializer(), this)

}

fun Field.toJsonBody(): String {
    return JSON.stringify(Field.serializer(), this)
}



fun User.toJsonBody(): String
{
    return JSON.stringify(User.serializer().list, listOf(User()))
}