package com.flix.movie.data.entities

data class Popular(
    val page: Int,
    val results: List<Movie>,
    val totalResults: Int,
    val totalPages: Int
)