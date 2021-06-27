package com.codinginflow.mvvmtodo.ui.tasks

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.codinginflow.mvvmtodo.data.TaskDAO

class TasksViewModel @ViewModelInject constructor(
    private val taskDAO: TaskDAO
) : ViewModel() {
}