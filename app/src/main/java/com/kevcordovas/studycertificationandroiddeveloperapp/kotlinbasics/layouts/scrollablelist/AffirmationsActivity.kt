package com.kevcordovas.studycertificationandroiddeveloperapp.kotlinbasics.layouts.scrollablelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.kevcordovas.studycertificationandroiddeveloperapp.R
import com.kevcordovas.studycertificationandroiddeveloperapp.kotlinbasics.layouts.scrollablelist.adapter.ItemAdapterAffirmations
import com.kevcordovas.studycertificationandroiddeveloperapp.kotlinbasics.layouts.scrollablelist.data.DataSource

class AffirmationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affirmations)
        val myDataSet = DataSource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapterAffirmations(this, myDataSet)
        recyclerView.setHasFixedSize(true)
    }
}