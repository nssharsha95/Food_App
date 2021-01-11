package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val img = arrayOf(R.drawable.bananas, R.drawable.bread, R.drawable.cococola,
            R.drawable.goodday, R.drawable.keloggs_corn_flakes,
            R.drawable.kurkure, R.drawable.paneer)

    private val texts = arrayOf("Bananas", "Bread", "CocoCola",
            "Good Day Biscuits", "Kellogs Corn Flakes", "Kurkure", "Paneer")

    private val desc = arrayOf("80/100, Excellent", "50/100, Good", "4/100, Bad",
            "45/100, Average", "75/100, Excellent", "10/100, Bad", "30/100, Average")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img,texts,desc)

    }
}