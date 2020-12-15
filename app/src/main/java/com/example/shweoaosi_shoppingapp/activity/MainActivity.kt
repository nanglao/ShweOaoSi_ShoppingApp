package com.example.shweoaosi_shoppingapp.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shweoaosi_shoppingapp.Product
import com.example.shweoaosi_shoppingapp.R
import com.example.shweoaosi_shoppingapp.adapter.RecyclerAdapter

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

        // The layout for this activity is a Data Binding layout so it needs to be inflated using
        // DataBindingUtil.
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)

        // The returned binding has references to all the Views with an ID.
        binding.observableFieldsActivityButton.setOnClickListener {
            startActivity(Intent(this, ObservableFieldActivity::class.java))
        }
        binding.viewmodelActivityButton.setOnClickListener {
            startActivity(Intent(this, ViewModelActivity::class.java))
        }
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