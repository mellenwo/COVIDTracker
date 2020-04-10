package com.mellenwood.covidtracker.domain

data class GlobalStat (val NewConfirmed: Long, val TotalConfirmed: Long, val NewDeaths: Long,
                       val TotalDeaths: Long, val NewRecovered: Long, val TotalRecovered: Long)