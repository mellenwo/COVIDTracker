package com.mellenwood.covidtracker.domain

data class GetSummaryResponse(val Global: GlobalStat, val Countries: List<CountryStat>, val Date: String)