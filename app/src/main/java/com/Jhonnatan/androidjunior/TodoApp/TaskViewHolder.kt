package com.Jhonnatan.androidjunior.TodoApp

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.Jhonnatan.androidjunior.R

class TaskViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val tvTask:TextView=view.findViewById(R.id.tvTasks)
    private val cbTask:CheckBox=view.findViewById(R.id.cbTask)

    fun Render(task: Task){

        tvTask.text= task.name

        var colorCategory= when(task.category){
            TaskCategory.Personal->{
                R.color.todo_personal_category
            }
            TaskCategory.Bussiness->{
               R.color.todo_business_category

            }
            TaskCategory.Other->{
                R.color.todo_other_category

            }

        }

        cbTask.buttonTintList= ColorStateList.valueOf(ContextCompat.getColor(cbTask.context, colorCategory))

        if (task.isSelected  ){
            tvTask.paintFlags= tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

        }else{
            tvTask.paintFlags= tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }
        cbTask.isChecked=task.isSelected



    }
}