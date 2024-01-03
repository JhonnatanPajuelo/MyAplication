package com.Jhonnatan.androidjunior.TodoApp

sealed class TaskCategory(var isSelected:Boolean=true) {
    object Personal:TaskCategory()
    object Bussiness: TaskCategory()
    object Other: TaskCategory()
}