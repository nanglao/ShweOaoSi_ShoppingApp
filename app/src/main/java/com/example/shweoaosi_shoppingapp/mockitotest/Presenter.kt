package com.example.shweoaosi_shoppingapp.mockitotest

internal interface Presenter<in T> {

    fun createView(view: T)

    fun destroyView()
}
