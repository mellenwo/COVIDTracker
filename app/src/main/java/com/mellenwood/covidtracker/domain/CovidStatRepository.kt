package com.mellenwood.covidtracker.domain

interface CovidStatRepository {
    suspend fun getGlobalSummary(): GetSummaryResponse
}