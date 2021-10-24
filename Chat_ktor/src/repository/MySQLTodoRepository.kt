package com.GlebXleb.repository

import com.GlebXleb.database.DatabaseManager
import com.GlebXleb.entities.ToDo
import com.GlebXleb.entities.ToDoDraft
import org.ktorm.database.Database

class MySQLTodoRepository : ToDoRepository  {

    private val database = DatabaseManager()

    override fun getAllToDos(): List<ToDo> {
       return database.getAllTodos()
           .map { ToDo(it.id,it.title, it.done) }
    }

    override fun getToDo(id: Int): ToDo? {
        TODO("Not yet implemented")
    }

    override fun addToDo(draft: ToDoDraft): ToDo {
        TODO("Not yet implemented")
    }

    override fun removeTodo(id: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun updateTodo(id: Int, draft: ToDoDraft): Boolean {
        TODO("Not yet implemented")
    }
}