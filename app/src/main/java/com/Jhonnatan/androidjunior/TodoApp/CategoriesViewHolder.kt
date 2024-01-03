package com.Jhonnatan.androidjunior.TodoApp

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.Jhonnatan.androidjunior.R
import com.Jhonnatan.androidjunior.databinding.ItemTaskCategoryBinding


class CategoriesViewHolder (view:View):RecyclerView.ViewHolder(view){

    val binding = ItemTaskCategoryBinding.bind(view)




    fun Render(taskCategory: TaskCategory, OnItemSelected: (Int) -> Unit){



        itemView.setOnClickListener{OnItemSelected(layoutPosition)}

        val color=if(taskCategory.isSelected){
            R.color.todo_background_card

        }else
            R.color.todo_background_disabled

        binding.cardCategory.setCardBackgroundColor(ContextCompat.getColor(binding.cardCategory.context,color))

        when(taskCategory){
            TaskCategory.Bussiness -> {
               binding.TvCategoryName.text="Negocios"
                binding.divider.setBackgroundColor(ContextCompat.getColor(binding.divider.context, R.color.todo_business_category))

            }
            TaskCategory.Other -> {
                binding.TvCategoryName.text="Otros"
                binding.divider.setBackgroundColor(ContextCompat.getColor(binding.divider.context, R.color.todo_other_category))

            }
            TaskCategory.Personal -> {
                binding.TvCategoryName.text="Personal"
                binding.divider.setBackgroundColor(ContextCompat.getColor(binding.divider.context, R.color.todo_personal_category))

                }
        }
    }

}