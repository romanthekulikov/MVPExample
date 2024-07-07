package com.example.myapplication

import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {
    val repository = Repository()
    fun requestChangeText(text: String) {
        viewState.changeText(text)
    }

    fun requestInitList() {
        viewState.initTaskList(repository.getList())
    }
}