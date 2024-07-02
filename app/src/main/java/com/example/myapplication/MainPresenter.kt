package com.example.myapplication

import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {
    fun requestChangeText(text: String) {
        viewState.changeText(text)
    }
}