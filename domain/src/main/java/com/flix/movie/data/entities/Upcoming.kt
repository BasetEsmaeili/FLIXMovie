package com.flix.movie.data.entities

data class Upcoming(
    val page:Int,
    val results:List<Movie>,
    val dates:Dates,
    val totalResults: Int,
    val totalPages: Int
)