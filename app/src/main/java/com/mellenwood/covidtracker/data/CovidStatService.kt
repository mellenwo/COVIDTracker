package com.mellenwood.covidtracker.data

import com.mellenwood.covidtracker.domain.GetSummaryResponse
import retrofit2.http.GET

interface CovidStatService {
    @GET("/summary")
    suspend fun getGlobalSummary(): GetSummaryResponse
}