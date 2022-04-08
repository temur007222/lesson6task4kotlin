package com.example.lesson6task4kotlin.Activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson6task4kotlin.Adapters.RecyclerAdapter
import com.example.lesson6task4kotlin.Model.User
import com.example.lesson6task4kotlin.R

class MainActivity : AppCompatActivity() {
    private lateinit var context: Context
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        val users: List<User> = prepareUserList()
        refreshAdapter(users as ArrayList<User>)
    }
    private fun initView(){
        context = this
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(context, 1)
    }
    private fun refreshAdapter(user: ArrayList<User>){
        val adapter = RecyclerAdapter(context, user)
        recyclerView.adapter = adapter
        recyclerView.isNestedScrollingEnabled = false
    }

    private fun prepareUserList(): List<User>{
        val users: MutableList<User> = ArrayList()
        users.add(User("Button"))
        return users
    }

}