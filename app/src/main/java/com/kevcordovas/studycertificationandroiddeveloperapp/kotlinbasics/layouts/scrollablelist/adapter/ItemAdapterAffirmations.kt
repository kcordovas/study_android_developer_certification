package com.kevcordovas.studycertificationandroiddeveloperapp.kotlinbasics.layouts.scrollablelist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kevcordovas.studycertificationandroiddeveloperapp.R
import com.kevcordovas.studycertificationandroiddeveloperapp.kotlinbasics.layouts.scrollablelist.model.Affirmation

class ItemAdapterAffirmations(
    private val context: Context,
    private val dataSet: List<Affirmation>,
) : RecyclerView.Adapter<ItemAdapterAffirmations.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_affirmations, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.image.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataSet.size

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title_affirmations)
        val image: ImageView = view.findViewById(R.id.item_image_affirmations)
    }
}