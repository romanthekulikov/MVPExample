package com.example.myapplication

class Repository {
    fun getList(): List<Task> {
        return listOf(Task(false, "Купить молоко"), Task(true, "Прибраться дома"))
    }
}