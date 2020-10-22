package com.example.shweoaosi_shoppingapp

import android.os.Bundle
import android.util.Log
import android.widget.GridLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // remove title bar
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.mainRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        recyclerView.adapter = RecyclerAdapter(this, fetchList(), this)
        Log.e("LLL", "MainAci: ");
    }

    private fun fetchList(): ArrayList<Product> {
        val list = arrayListOf<Product>()

        for (i in 0..9) {
            val model = Product(
                "Title : $i",
                "Subtitle : $i",
                R.drawable.photo1
            )
            list.add(model)
        }
        return list
    }

    fun onCellClickListener() {
        Toast.makeText(this,"Cell clicked", Toast.LENGTH_SHORT).show()
    }
}