package com.example.dragonball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dragonball.adapter.RecyclerViewAdapter
import com.example.dragonball.data.DataSource

class MainActivity : AppCompatActivity() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var dataSourse: DataSource


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myDataSet = DataSource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.idCourseRV)


        val layoutManager = GridLayoutManager(this, 2)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = RecyclerViewAdapter(this, myDataSet)
        recyclerView.setHasFixedSize(true)

    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }
}