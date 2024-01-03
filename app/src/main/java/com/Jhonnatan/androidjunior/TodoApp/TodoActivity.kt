package com.Jhonnatan.androidjunior.TodoApp

import android.app.Activity
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Jhonnatan.androidjunior.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TodoActivity : AppCompatActivity() {
    private var categories:List<TaskCategory> = listOf(
        TaskCategory.Personal,
        TaskCategory.Bussiness,
        TaskCategory.Other,

    )
    private var tasks = mutableListOf(
        Task("Prueba Negocio",TaskCategory.Bussiness),
        Task("Prueba Personal",TaskCategory.Personal),
        Task("Prueba Otros",TaskCategory.Other),

        )


    //Creamos las variables
    private lateinit var rvCategories:RecyclerView
    private lateinit var categoryAdapter: CategoriesAdapter

    private lateinit var rvTasks:RecyclerView
    private lateinit var taskAdapter: TaskAdapter
    private lateinit var fabAddTask:FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        InitComponent()
        InitUI()
        InitListeners()

    }

    private fun InitComponent() {
        rvTasks=findViewById(R.id.rvTasks)
        rvCategories=findViewById(R.id.rvCategories)
        fabAddTask=findViewById(R.id.favAddTask)
    }

    private fun InitListeners() {
        fabAddTask.setOnClickListener{showDialog()}
    }

    private fun showDialog(){
        val dialog=Dialog(this)
        dialog.setContentView(R.layout.dialog_task)

        val btnAddTask:Button=dialog.findViewById(R.id.btnAddTask)
        val etTask=dialog.findViewById<EditText>(R.id.etTask)
        val rgCateogries:RadioGroup=dialog.findViewById(R.id.rgTaskCategories)
        dialog.show()

        btnAddTask.setOnClickListener {
            if(etTask.text.isNotEmpty()){
            val ObjetoTask:Task

            val selectedId=rgCateogries.checkedRadioButtonId
            val selectedRadioButton:RadioButton= rgCateogries.findViewById(selectedId)
            val currentCategory:TaskCategory= when(selectedRadioButton.text){
                "Negocios"-> TaskCategory.Bussiness
                "Personal"-> TaskCategory.Personal
                else -> TaskCategory.Other
            }
            ObjetoTask=Task(etTask.text.toString(),currentCategory)
            tasks.add(ObjetoTask)
            updateTask()
            dialog.hide()
                
        }}



    }
    private fun InitUI() {
        //Inicializa el Category Adapter
        categoryAdapter= CategoriesAdapter(categories){pos->updateCategory(pos)}
        //Esto se escaga de que la vista del Rv el scrool sea Horizontal o vertical
        rvCategories.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvCategories.adapter=categoryAdapter

        taskAdapter= TaskAdapter(tasks) { position->onItemSelected(position) }
        rvTasks.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvTasks.adapter=taskAdapter
    }

    private fun onItemSelected(position:Int){
        tasks[position].isSelected=!tasks[position].isSelected
        updateTask()
    }

    private fun updateTask(){

        val selectedCategories:List<TaskCategory> =categories.filter { it.isSelected }
        val newTask=tasks.filter { selectedCategories.contains(it.category) }
        taskAdapter.task=newTask
        taskAdapter.notifyDataSetChanged()
    }


    private fun updateCategory(position: Int){
        categories[position].isSelected=!categories[position].isSelected
        categoryAdapter.notifyItemChanged(position)
        updateTask()
    }
}