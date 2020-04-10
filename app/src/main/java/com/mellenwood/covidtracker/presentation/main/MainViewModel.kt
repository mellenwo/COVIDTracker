package com.mellenwood.covidtracker.presentation.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mellenwood.covidtracker.domain.CovidStatRepository
import com.mellenwood.covidtracker.domain.GlobalStat
import kotlinx.coroutines.launch

class MainViewModel(private val repository: CovidStatRepository) : ViewModel() {

    val globalStat : MutableLiveData<GlobalStat> by lazy {
        MutableLiveData<GlobalStat>()
    }

    val totalConfirmedGlobal : MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun getGlobalSummary() {
        viewModelScope.launch {
            val response = repository.getGlobalSummary()

            globalStat.value = response.Global

            totalConfirmedGlobal.value = response.Global.TotalConfirmed.toString()
            print(totalConfirmedGlobal.value)
        }
    }

}
