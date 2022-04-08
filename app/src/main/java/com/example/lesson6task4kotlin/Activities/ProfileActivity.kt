package com.example.lesson6task4kotlin.Activities

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson6task4kotlin.Model.User
import com.example.lesson6task4kotlin.R

class ProfileActivity: AppCompatActivity() {
    private val TAG = ProfileActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)
        initView()
    }
    private fun initView(){
        val tv_detail: TextView = findViewById(R.id.tv_detail)
        val user: User = getIntent().getSerializableExtra("user") as User
        Log.d(TAG, user.toString())
        tv_detail.text = user.toString()
    }
}
