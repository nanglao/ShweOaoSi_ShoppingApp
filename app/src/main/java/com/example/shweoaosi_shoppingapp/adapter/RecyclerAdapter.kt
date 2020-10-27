package com.example.shweoaosi_shoppingapp.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.shweoaosi_shoppingapp.activity.MainActivity
import com.example.shweoaosi_shoppingapp.Product
import com.example.shweoaosi_shoppingapp.R

class RecyclerAdapter(private val context: Context,
                      private val list: ArrayList<Product>,
                      private val cellClickListener: MainActivity
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val iconIV: ImageView = view.findViewById(R.id.itemImageView)
        val titleTV: TextView = view.findViewById(R.id.itemTextView)
        val subtitleTV: TextView = view.findViewById(R.id.itemTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        Log.e("LLL", "onBindViewHolder: ");
        holder.iconIV.setImageDrawable(ContextCompat.getDrawable(context, data.icon))
        holder.titleTV.text = data.title
        holder.subtitleTV.text = data.subtitle

        holder.itemView.setOnClickListener {
            cellClickListener.onCellClickListener()
        }
    }
}