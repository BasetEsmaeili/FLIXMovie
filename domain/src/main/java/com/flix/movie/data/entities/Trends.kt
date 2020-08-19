package com.flix.movie.data.entities

data class Trends(
    val page:Int,
    val result:List<Movie>,
    val totalResults: Int,
    val totalPages: Int
)