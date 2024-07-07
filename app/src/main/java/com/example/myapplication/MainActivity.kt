package com.example.myapplication

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.recycler.TaskListAdapter
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {
    val mainPresenter by moxyPresenter { MainPresenter() }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            mainPresenter.requestInitList()
        }
    }

    override fun changeText(text: String) {

    }

    override fun initTaskList(taskList: List<Task>) {
        val adapter = TaskListAdapter(taskList)
        binding.recyclerviewTask.adapter = adapter
        binding.recyclerviewTask.layoutManager = LinearLayoutManager(this)
    }
}