package com.example.lesson6task4kotlin.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson6task4kotlin.Activities.ProfileActivity
import com.example.lesson6task4kotlin.Model.User
import com.example.lesson6task4kotlin.R

class RecyclerAdapter(private var context: Context?, private var user: ArrayList<User>?):RecyclerView.Adapter<RecyclerAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.UserViewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.item_user_list, parent,false)
    return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val users = user?.get(position)

        if (holder is UserViewHolder){
            val tv_lastName = holder.tv_lastName
            if (users != null){
                tv_lastName.text = users.getLastName()
            }
        }
        holder.tv_lastName.setOnClickListener( View.OnClickListener() {
            val user1 = User("temur")
            onClick(user1)
    })
    }

    override fun getItemCount(): Int {
        return user!!.size
    }

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view){
        var tv_lastName: TextView = view.findViewById(R.id.tv_lastName)
    }

    fun onClick(user1: User) {
        val intent = Intent(context, ProfileActivity::class.java)
        intent.putExtra("user", user1)
        context!!.startActivity(intent)
    }
}