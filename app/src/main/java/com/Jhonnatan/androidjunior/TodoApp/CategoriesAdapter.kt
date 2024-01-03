package com.Jhonnatan.androidjunior.TodoApp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.Jhonnatan.androidjunior.R

class CategoriesAdapter (private val categories: List<TaskCategory>, private val OnItemSelected:(Int)-> Unit) :
    RecyclerView.Adapter<CategoriesViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
         val view =LayoutInflater.from(parent.context).inflate(R.layout.item_task_category,parent,false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.Render(categories[position],OnItemSelected)
    }


    //Retorna el numero de elemntos del recycleview
    override fun getItemCount(): Int {
        return categories.size
    }
}