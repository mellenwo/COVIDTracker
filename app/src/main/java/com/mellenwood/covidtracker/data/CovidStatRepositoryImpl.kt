package com.mellenwood.covidtracker.data

import com.mellenwood.covidtracker.domain.CovidStatRepository
import com.mellenwood.covidtracker.domain.GetSummaryResponse

class CovidStatRepositoryImpl : CovidStatRepository {

    private val apiService : CovidStatService = CovidStatServiceImpl().buildRetrofitService()

    override suspend fun getGlobalSummary(): GetSummaryResponse {
        return apiService.getGlobalSummary()
    }

}